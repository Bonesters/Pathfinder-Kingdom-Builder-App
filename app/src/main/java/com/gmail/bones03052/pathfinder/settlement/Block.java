package com.gmail.bones03052.pathfinder.settlement;

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
}
