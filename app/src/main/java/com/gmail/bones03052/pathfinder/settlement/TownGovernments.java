package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by dennis on 9/2/16.
 */
public enum TownGovernments
{
    AUTOCRACY(0,0,0,0,0,0),
    COLONIAL(2,1,0,1,0,0),
    COUNCIL(4,0,0,-2,-2,0),
    DYNASTY(1,0,-2,1,0,0),
    MAGICAL(-2,0,-2,0,2,0),
    MILITARY(-1,0,-1,3,0,0),
    OVERLORD(2,0,-2,2,0,-2),
    SECRET_SYNDICATE(2,2,0,-6,0,2),
    THEOCRACY(0,0,0,0,0,0),
    PLUTOCRACY(2,3,-2,0,0,2),
    UPOTIAN_EXPERIMENT(-2,0,2,0,1,-1);

    public final int CORRUPTION;
    public final int PRODUCTIVITY;
    public final int SOCIETY;
    public final int LAW;
    public final int LORE;
    public final int CRIME;

    private TownGovernments(int corruption,int productivity,int society,int law,int lore,int crime)
    {
        this.CORRUPTION=corruption;
        this.PRODUCTIVITY=productivity;
        this.SOCIETY=society;
        this.LAW=law;
        this.LORE=lore;
        this.CRIME=crime;
    }
}