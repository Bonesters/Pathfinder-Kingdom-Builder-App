package com.gmail.bones03052.pathfinder.sql;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

import com.gmail.bones03052.pathfinder.settlement.BuildStat;
import com.gmail.bones03052.pathfinder.settlement.Building;
import com.gmail.bones03052.pathfinder.settlement.Qualities;
import com.gmail.bones03052.pathfinder.settlement.Quality;
import com.gmail.bones03052.pathfinder.settlement.TownGovernment;
import com.gmail.bones03052.pathfinder.settlement.TownGovernments;

/**
 * Created by Dennis Champagne on 10/3/16.
 */

public class DBHandler extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "settlements.db";
    private static final String TABLE_BUILDINGS = "buildings";
    private static final String TABLE_TOWN_GOVERNMENTS="town governments";
    private static final String TABLE_QUALITIES="qualities";

    public static final String COL_ID="id";
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
    public static final String COL_COST="cost (BP)";
    public static final String COL_BUILD_TIME="build time (months)";
    public static final String COL_SPELL_MOD="spell level modifier";
    public static final String COL_BASE_MUL="base value multiplier";
    public static final String COL_PUR_MUL="purchase value multiplier";
    public static final String COL_DANGER="danger";
    public static final String COL_SPECIAL="special";
    public static final String COL_SPECIAL_TEXT="special text";

    public static final int CURRENT_VERSION=0;

    public DBHandler(Context context, String name,SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String CreateBuildingTable="CREATE TABLE "+TABLE_BUILDINGS+"("+COL_ID+" INTEGER PRIMARY KEY,"+COL_NAME+" TEXT,"+COL_ECO+" INTEGER,"+COL_LOYALTY+" INTEGER,"+COL_STABILITY+" INTEGER,"+COL_UNREST+" INTEGER,"+COL_CORRUPTION+" INTEGER,"+COL_CRIME+" INTEGER,"+COL_POP+" INTEGER,"+COL_FAME+" INTEGER,"+COL_INFAMY+" REAL,"+COL_BVAL+" INTEGER,"+COL_LVL+" INTEGER,"+COL_PROD+" INTEGER,"+COL_LOTS+" INTEGER,"+COL_COST+" INTEGER,"+COL_BUILD_TIME+" INTEGER,"+COL_SPECIAL+" BOOLEAN,"+COL_SPECIAL_TEXT+" TEXT)";
        db.execSQL(CreateBuildingTable);
        for(BuildStat b:BuildStat.values())
        {
            addBuilding(new Building(b));
        }

        String CreateQualitiesTable="CREATE TABLE "+TABLE_QUALITIES+"("+COL_ID+" INTEGER PRIMARY KEY,"+COL_NAME+" TEXT,"+COL_CORRUPTION+" INTEGER,"+COL_PROD+" INTEGER,"+COL_SOCIETY+" INTEGER,"+COL_LAW+" INTEGER,"+COL_LORE+" INTEGER,"+COL_CRIME+" INTEGER,"+COL_SPELL_MOD+" INTEGER,"+COL_BASE_MUL+" REAL,"+COL_PUR_MUL+" REAL,"+COL_DANGER+" INTEGER,"+COL_SPECIAL+" BOOLEAN,"+COL_SPECIAL_TEXT+" TEXT)";
        db.execSQL(CreateQualitiesTable);
        for(Qualities q:Qualities.values())
        {
            addQuality(new Quality(q));
        }

        String CreateTownGovTable="CREATE TABLE "+TABLE_TOWN_GOVERNMENTS+"("+COL_ID+" INTEGER PRIMARY KEY,"+COL_NAME+" TEXT,"+COL_CORRUPTION+" INTEGER,"+COL_PROD+" INTEGER,"+COL_SOCIETY+" INTEGER,"+COL_LAW+" INTEGER,"+COL_LORE+" INTEGER,"+COL_CRIME+" INTEGER,"+COL_SPECIAL+" BOOLEAN,"+COL_SPECIAL_TEXT+" TEXT)";
        db.execSQL(CreateTownGovTable);
        for(TownGovernments g:TownGovernments.values())
        {
            addTownGovernment(new TownGovernment(g));
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        //TODO: add version change handler.
    }

    public int addBuilding(Building b)
    {
        ContentValues values = new ContentValues();
        if(b.getId()>=0)
        {
            values.put(COL_ID,b.getId());
        }
        values.put(COL_NAME,b.getName());
        values.put(COL_ECO,b.getEconomy());
        values.put(COL_LOYALTY,b.getLoyalty());
        values.put(COL_STABILITY,b.getStability());
        values.put(COL_UNREST,b.getUnrest());
        values.put(COL_CORRUPTION,b.getCorruption());
        values.put(COL_CRIME,b.getCrime());
        values.put(COL_LAW,b.getLaw());
        values.put(COL_LORE,b.getLore());
        values.put(COL_SOCIETY,b.getSociety());
        values.put(COL_POP,b.getPopulation());
        values.put(COL_FAME,b.getFame());
        values.put(COL_INFAMY,b.getInfamy());
        values.put(COL_BVAL,b.getBaseValue());
        values.put(COL_LVL,b.getLevel());
        values.put(COL_PROD,b.getProductivity());
        values.put(COL_LOTS,b.getLots());
        values.put(COL_COST,b.getCost());
        values.put(COL_BUILD_TIME,b.getBuildTime());
        values.put(COL_SPECIAL,b.isSpecial());
        values.put(COL_SPECIAL_TEXT,b.getSpecial());

        SQLiteDatabase db = this.getWritableDatabase();

        int i=(int)db.insert(TABLE_BUILDINGS, null, values);
        db.close();
        return i;
    }

    public int addQuality(Quality q)
    {
        ContentValues values = new ContentValues();
        if(q.getId()>=0)
        {
            values.put(COL_ID,q.getId());
        }
        values.put(COL_NAME,q.getName());
        values.put(COL_CORRUPTION,q.getCorruption());
        values.put(COL_PROD,q.getProductivity());
        values.put(COL_SOCIETY,q.getSociety());
        values.put(COL_LAW,q.getLaw());
        values.put(COL_LORE,q.getLore());
        values.put(COL_CRIME,q.getCrime());
        values.put(COL_SPELL_MOD,q.getSpellMod());
        values.put(COL_BASE_MUL,q.getbValMul());
        values.put(COL_PUR_MUL,q.getPurMul());
        values.put(COL_DANGER,q.getDanger());
        values.put(COL_SPECIAL,q.isSpecial());
        values.put(COL_SPECIAL_TEXT,q.getSpecial());

        SQLiteDatabase db = this.getWritableDatabase();

        int i=(int)db.insert(TABLE_QUALITIES, null, values);
        db.close();
        return i;
    }

    public int addTownGovernment(TownGovernment g)
    {
        ContentValues values = new ContentValues();
        if(g.getId()>=0)
        {
            values.put(COL_ID,g.getId());
        }
        values.put(COL_CORRUPTION,g.getCorruption());
        values.put(COL_PROD,g.getProductivity());
        values.put(COL_SOCIETY,g.getSociety());
        values.put(COL_LAW,g.getLaw());
        values.put(COL_LORE,g.getLore());
        values.put(COL_CRIME,g.getCrime());
        values.put(COL_SPECIAL,g.isSpecial());
        values.put(COL_SPECIAL_TEXT,g.getSpecial());

        SQLiteDatabase db = this.getWritableDatabase();

        int i=(int)db.insert(TABLE_TOWN_GOVERNMENTS, null, values);
        db.close();
        return i;
    }



    /*
    example method from:
        http://www.techotopia.com/index.php/An_Android_Studio_SQLite_Database_Tutorial

        public Product findProduct(String productname)
        {
            String query = "Select * FROM " + TABLE_PRODUCTS + " WHERE " + COLUMN_PRODUCTNAME + " =  \"" + productname + "\"";

            SQLiteDatabase db = this.getWritableDatabase();

            Cursor cursor = db.rawQuery(query, null);

            Product product = new Product();

            if (cursor.moveToFirst())
            {
                cursor.moveToFirst();
                product.setID(Integer.parseInt(cursor.getString(0)));
                product.setProductName(cursor.getString(1));
                product.setQuantity(Integer.parseInt(cursor.getString(2)));
                cursor.close();
            }
            else
            {
                product = null;
            }
            db.close();
            return product;
        }
     */
}
