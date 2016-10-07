package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public enum TownGovernments
{
    AUTOCRACY(0,0,0,0,0,0,false,""),
    COLONIAL(2,1,0,1,0,0,false,""),
    COUNCIL(4,0,0,-2,-2,0,false,""),
    DYNASTY(1,0,-2,1,0,0,false,""),
    MAGICAL(-2,0,-2,0,2,0,false,""),
    MILITARY(-1,0,-1,3,0,0,false,""),
    OVERLORD(2,0,-2,2,0,-2,false,""),
    SECRET_SYNDICATE(2,2,0,-6,0,2,false,""),
    THEOCRACY(0,0,0,0,0,0,true,"Double the modifiers for the settlement's alignment. The settlement gains any one of the following qualities as a ‘bonus' quality: desecrate/hallow, Holy Site, Pious, Racial Enclave, Racially Intolerant, Unholy Site."),
    PLUTOCRACY(2,3,-2,0,0,2,false,""),
    UPOTIAN_EXPERIMENT(-2,0,2,0,1,-1,false,"");

    public final int CORRUPTION;
    public final int PRODUCTIVITY;
    public final int SOCIETY;
    public final int LAW;
    public final int LORE;
    public final int CRIME;
    public final boolean SPECIAL;
    public final String SPECIAL_TEXT;

    TownGovernments(int corruption,int productivity,int society,int law,int lore,int crime,boolean special,String specialText)
    {
        this.CORRUPTION=corruption;
        this.PRODUCTIVITY=productivity;
        this.SOCIETY=society;
        this.LAW=law;
        this.LORE=lore;
        this.CRIME=crime;
        this.SPECIAL=special;
        this.SPECIAL_TEXT=specialText;
    }

    @Override
    public String toString()
    {
        return (new TownGovernment(this)).toString();
    }
}