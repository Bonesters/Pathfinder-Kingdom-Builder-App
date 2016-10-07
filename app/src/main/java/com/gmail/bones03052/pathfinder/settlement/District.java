package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public class District
{
    /*
    each district is separated into 9 blocks, organized in a 3x3 square
    each block is separated by roads, and contains 4 lots, separated by allies
    each lot can be considered to be 750ftx750ft, and the district being about 1 square mile
     */
    private Block blocks[][]=new Block[3][3];

    public District()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                blocks[i][j]=new Block();
            }
        }
    }

    public Block getBlock(int x,int y)
    {
        if((x>=0&&x<3)&&(y>=0&&y<3))
        {
            return blocks[x][y];
        }
        else
        {
            return null;
        }
    }
}
