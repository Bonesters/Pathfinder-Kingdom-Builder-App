package com.gmail.bones03052.pathfinder.sql;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

/**
 * Created by root on 10/3/16.
 */

public class DBHandler extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "settlements.db";
    private static final String TABLE_BUILDINGS = "buildings";

    public static final String COL_NAME="name";
    public static final String COL_ECO="economy";
    public static final String COL_LOYALTY="loyalty";
    public static final String COL_STABILITY="stability";
    public static final String COL_UNREST="unrest";
    public static final String COL_CORRUPTION="corruption";
    public static final String COL_CRIME="crime";
    public static final String COL_LAW="law";
    public static final String COL_LORE="lore";
    public static final String COL_SOCIETY="society";
    public static final String COL_POP="population";
    public static final String COL_FAME="fame";
    public static final String COL_INFAMY="infamy";
    public static final String COL_BVAL="base value";
    public static final String COL_LVL="level";
    public static final String COL_PROD="productivity";
    public static final String COL_LOTS="lots";


    public DBHandler(Context context, String name,SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {

    }
}
