package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public class Lot
{
    private boolean empty=true;
    private BuildingOld occupant;
    private boolean shared=false;

    public Lot()
    {

    }

    public boolean isEmpty()
    {
        return empty;
    }

    public void setEmpty(boolean empty)
    {
        this.empty = empty;
    }

    public BuildingOld getOccupant()
    {
        return occupant;
    }

    public void setOccupant(BuildingOld occupant)
    {
        this.occupant = occupant;
        shared=((occupant.getLots()>1)?true:false);
    }

    public boolean isShared()
    {
        return shared;
    }
}
