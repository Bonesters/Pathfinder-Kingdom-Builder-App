package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by dennis on 9/2/16.
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
}
