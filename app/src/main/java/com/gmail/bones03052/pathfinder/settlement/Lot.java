package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
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

    public Building getOccupant()
    {
        return occupant;
    }

    public void setOccupant(Building occupant)
    {
        this.occupant = occupant;
        if(occupant==null)
        {
            empty=true;
            shared=false;
        }
        else
        {
            empty=false;
            shared=(occupant.getLots()>1);
        }
    }

    public boolean isShared()
    {
        return shared;
    }
}
