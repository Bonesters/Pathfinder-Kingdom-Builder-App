package com.gmail.bones03052.pathfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gmail.bones03052.pathfinder.settlement.Settlement;
import com.gmail.bones03052.pathfinder.sql.DBHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedList;

/**
 * Created by Dennis Champagne on 9/2/16.
 */

public class MainActivity extends AppCompatActivity
{

    public static final String SETLEMENTS="settlements";

    private DBHandler database;
    private LinkedList<Settlement> settlements=new LinkedList<>();

    //TODO: entire graphical interface...

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database=new DBHandler(this,DBHandler.DATABASE_NAME,null,DBHandler.DATABASE_VERSION);
    }

    public JSONObject save() throws JSONException
    {
        JSONObject object=new JSONObject();

        //any data you need to save can be put in the object also.


        JSONArray sett=new JSONArray();
        for(Settlement s:settlements)
        {
            sett.put(s.toJSONObject());
        }
        object.put(SETLEMENTS,sett);
        return object;
    }
}
