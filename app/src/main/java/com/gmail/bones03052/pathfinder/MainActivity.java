package com.gmail.bones03052.pathfinder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gmail.bones03052.pathfinder.gui.SettlementFragment;
import com.gmail.bones03052.pathfinder.settlement.BuildStat;
import com.gmail.bones03052.pathfinder.settlement.Building;
import com.gmail.bones03052.pathfinder.settlement.District;
import com.gmail.bones03052.pathfinder.settlement.Qualities;
import com.gmail.bones03052.pathfinder.settlement.Quality;
import com.gmail.bones03052.pathfinder.settlement.Settlement;
import com.gmail.bones03052.pathfinder.settlement.TownGovernment;
import com.gmail.bones03052.pathfinder.settlement.TownGovernments;
import com.gmail.bones03052.pathfinder.sql.DBHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

/*
    isometric building art.

    http://opengameart.org/content/coastal-tent-buildings-and-animated-signal-fire-unknown-horizons-3d
    http://opengameart.org/content/medieval-building-03-bleeds-game-art
    http://opengameart.org/content/medieval-building-02-bleeds-game-art
    http://opengameart.org/content/medieval-building-01-bleeds-game-art-0
    http://opengameart.org/content/medieval-building-06
    http://opengameart.org/content/medieval-stable-isometric-25d
    http://opengameart.org/content/6-isometric-buildings
    http://opengameart.org/content/watermill-bleeds-game-art
    http://opengameart.org/content/western-european-medieval-houses-isometric-25d
    http://opengameart.org/content/medieval-wooden-guard-tower-isometric-25d
    http://opengameart.org/content/medieval-stone-guard-tower-isometric-25d
    http://opengameart.org/content/medieval-archery-range-isometric-25d
    http://opengameart.org/content/hut-bleeds-game-art
    http://opengameart.org/content/tents-hunter-lumberjack-pavilion-storage-unknown-horizons-2d
    http://opengameart.org/content/hreikins-modular-medieval-buildings
    http://opengameart.org/content/quarters-bleeds-game-art
    http://opengameart.org/content/grassland-tileset
    http://opengameart.org/content/cave-tileset
    https://remusprites.carbonmade.com/projects/4970388
 */

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public class MainActivity extends AppCompatActivity
{

    public static final String SETLEMENTS="settlements";
    public static final String SAVE_DATA_FILENAME="saveData.json";

    private DBHandler database;
    private LinkedList<Settlement> settlements=new LinkedList<>();

    //TODO: 1) Finish tabs in graphical interface
    //TODO: 2) Find a way to create new tabs on settlement creation

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database=new DBHandler(this,DBHandler.DATABASE_NAME,null,DBHandler.DATABASE_VERSION);
        load();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_add_new) {
            //TODO: spawn a new settlement fragment and add it to the list
            return true;
        }

        if (id == R.id.action_view_current) {
            //TODO: spawn a new fragment that displays the settlements

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            Fragment fragment1 = new SettlementFragment();
            //transaction.replace(R.id.container, fragment1);
            transaction.commit();

            /*

            //Within the fragment do this:
                // Inflate the layout for this fragment
                View rootView = inflater.inflate(R.layout.fragment1_main, container, false);

                Button myBtn = (Button) rootView.findViewById(R.id.myBtn1);
                myBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction transaction = fm.beginTransaction();
                        Fragment fragment2 = new MyFragment2();
                        transaction.replace(R.id.container, fragment2);
                        transaction.commit();
                    }
                } );

                return rootView;

            */
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        save();
    }

    /**
     * this method loads the data from the JSON file. (avoid using it for anything else)
     */
    private void load()
    {
        try
        {
            FileInputStream in=openFileInput(SAVE_DATA_FILENAME);
            BufferedReader b=new BufferedReader(new InputStreamReader(in));
            String data="";
            while(b.ready())
            {
                data+=b.readLine()+"\n";
            }
            JSONObject json=new JSONObject(data);
            settlements=loadSettlements(json);
            Log.v("Pathfinder-settlement:","successfully loaded saved data (hopefully).");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            settlements=new LinkedList<>();
        }
    }

    private void save()
    {
        try
        {
            FileOutputStream out=openFileOutput(SAVE_DATA_FILENAME,Context.MODE_PRIVATE);
            out.write(toJSON().toString().getBytes());
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public JSONObject toJSON() throws JSONException
    {
        JSONObject object=new JSONObject();

        //greg, any data you need to save can be put in the object also.


        JSONArray sett=new JSONArray();
        for(Settlement s:settlements)
        {
            sett.put(s.toJSONObject());
        }
        object.put(SETLEMENTS,sett);
        saveBuildings();
        saveQualities();
        saveGovernments();
        return object;
    }

    private void saveGovernments()
    {
        LinkedList<TownGovernment> newGovs=new LinkedList<>();
        LinkedList<Integer> newGovIds=new LinkedList<>();
        LinkedList<Integer> govIds=new LinkedList<>();
        for(TownGovernments g:TownGovernments.values())
        {
            govIds.add(g.ordinal());
        }
        for(Settlement s:settlements)
        {
            TownGovernment g=s.getGovernment();
            if(!govIds.contains(g.getId())&&!newGovIds.contains(g.getId()))
            {
                if(database.findTownGovernment(g.getId())==null)
                {
                    newGovIds.add(g.getId());
                    newGovs.add(g);
                }
            }
        }
        for(TownGovernment g:newGovs)
        {
            database.addTownGovernment(g);
        }
        Log.v("Pathfinder-settlement:","saved "+newGovs.size()+" custom governments.");
    }

    private void saveQualities()
    {
        LinkedList<Quality> newQualities=new LinkedList<>();
        LinkedList<Integer> newQualIds=new LinkedList<>();
        LinkedList<Integer> qualIds=new LinkedList<>();
        for(Qualities q:Qualities.values())
        {
            qualIds.add(q.ordinal());
        }
        for(Settlement s:settlements)
        {
            for(Quality q:s.getQual())
            {
                if(!qualIds.contains(q.getId())&&!newQualities.contains(q.getId()))
                {
                    if(database.findQuality(q.getId())==null)
                    {
                        newQualIds.add(q.getId());
                        newQualities.add(q);
                    }
                }
            }
        }
        for(Quality q:newQualities)
        {
            database.addQuality(q);
        }
        Log.v("Pathfinder-settlement:","saved "+newQualities.size()+" custom qualities.");
    }

    private void saveBuildings()
    {
        LinkedList<Building> newBuildings=new LinkedList<>();
        LinkedList<Integer> newBuildIds=new LinkedList<>();
        LinkedList<Integer> buildIds=new LinkedList<>();
        for(BuildStat b:BuildStat.values())
        {
            buildIds.add(b.ordinal());
        }
        for(Settlement s:settlements)
        {
            for(District d:s.getDistricts())
            {
                for(Building b:d.getBuildings())
                {
                    if(!buildIds.contains(b.getId())&&!newBuildIds.contains(b.getId()))
                    {
                        if(database.findBuilding(b.getId())==null)
                        {
                            newBuildIds.add(b.getId());
                            newBuildings.add(b);
                        }
                    }
                }
            }
        }
        for(Building b:newBuildings)
        {
            database.addBuilding(b);
        }
        Log.v("Pathfinder-settlement:","saved "+newBuildings.size()+" custom buildings.");
    }

    public LinkedList<Settlement> loadSettlements(JSONObject data)
    {
        LinkedList<Settlement> settlements=new LinkedList<>();
        try
        {
            JSONArray sett=data.getJSONArray(SETLEMENTS);
            for(int i=0;i<sett.length();i++)
            {
                settlements.add(new Settlement(sett.getJSONObject(i),database));
            }
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        return settlements;
    }
}
