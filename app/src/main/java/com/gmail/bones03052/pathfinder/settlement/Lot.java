package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by dennis on 9/2/16.
 */
public class Lot
{
    private boolean empty=true;
    private Building occupant;
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

    public Building getOccupant()
    {
        return occupant;
    }

    public void setOccupant(Building occupant)
    {
        this.occupant = occupant;
        shared=((occupant.getLots()>1)?true:false);
    }

    public boolean isShared()
    {
        return shared;
    }
}
