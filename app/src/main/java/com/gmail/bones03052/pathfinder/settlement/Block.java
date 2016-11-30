package com.gmail.bones03052.pathfinder.settlement;

import com.gmail.bones03052.pathfinder.sql.DBHandler;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.LinkedList;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public class Block
{
    private Lot lots[][]=new Lot[2][2];

    public Block()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                lots[i][j]=new Lot();
            }
        }
    }

    public Block(JSONArray block,DBHandler database) throws JSONException
    {
        this();
        for(int i=0;i<block.length();i++)
        {
            JSONArray builds=block.getJSONArray(i);
            Building b=database.findBuilding(builds.getInt(0));
            JSONArray pos=builds.getJSONArray(1);
            for(int j=0;j<pos.length();j++)
            {
                int x=pos.getJSONArray(j).getInt(0);
                int y=pos.getJSONArray(j).getInt(0);
                lots[x][y].setOccupant(b);
            }
        }
    }

    public Lot getLot(int x,int y)
    {
        if((x==0||x==1)&&(y==0||y==1))
            return lots[x][y];
        else
            return null;
    }

    public LinkedList<Building> getBuildings()
    {
        LinkedList<Building> b=new LinkedList<>();
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(!lots[i][j].isEmpty())
                {
                    if(!b.contains(lots[i][j].getOccupant()))
                    {
                        b.add(lots[i][j].getOccupant());
                    }
                }
            }
        }
        return b;
    }

    public JSONArray toJSONArray() throws JSONException
    {
        JSONArray object=new JSONArray();
        LinkedList<Building> builds=getBuildings();
        if(builds.size()>0)
        {
            for(Building b:builds)
            {
                JSONArray build=new JSONArray();
                build.put(b.getId());
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        if(getLot(i,j).getOccupant()==b)
                        {
                            JSONArray pos=new JSONArray();
                            pos.put(i);
                            pos.put(j);
                            build.put(pos);
                        }
                    }
                }
                object.put(build);
            }
        }
        return object;
    }
}
