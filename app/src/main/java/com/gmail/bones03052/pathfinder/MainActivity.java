package com.gmail.bones03052.pathfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gmail.bones03052.pathfinder.sql.DBHandler;

/**
 * Created by Dennis Champagne on 9/2/16.
 */

public class MainActivity extends AppCompatActivity
{

    private DBHandler database;

    //TODO: entire graphical interface...

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database=new DBHandler(this,DBHandler.DATABASE_NAME,null,DBHandler.DATABASE_VERSION);
    }
}
