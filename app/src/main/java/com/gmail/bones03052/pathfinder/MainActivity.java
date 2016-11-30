package com.gmail.bones03052.pathfinder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;

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
    //TODO: 3) Add new settlements to the options menu after creation

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database=new DBHandler(this,DBHandler.DATABASE_NAME,null,DBHandler.DATABASE_VERSION);
        //TODO: read data in.
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
    }

    public LinkedList<Settlement> load(JSONObject data)
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
