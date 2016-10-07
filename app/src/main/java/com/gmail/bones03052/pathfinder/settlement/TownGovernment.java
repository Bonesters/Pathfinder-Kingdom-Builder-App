package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 10/6/2016.
 */

public class TownGovernment
{
    private int id;
    private int corruption;
    private int productivity;
    private int society;
    private int law;
    private int lore;
    private int crime;
    private boolean special;
    private String specialText;

    public TownGovernment(int id,int corruption,int productivity,int society,int law,int lore,int crime,boolean special,String specialText)
    {
        this.id=id;
        this.corruption=corruption;
        this.productivity=productivity;
        this.society=society;
        this.law=law;
        this.lore=lore;
        this.crime=crime;
        this.special=special;
        this.specialText=specialText;
    }

    public TownGovernment(TownGovernments g)
    {
        this(g.ordinal(),g.CORRUPTION,g.PRODUCTIVITY,g.SOCIETY,g.LAW,g.LORE,g.CRIME,g.SPECIAL,g.SPECIAL_TEXT);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getCorruption()
    {
        return corruption;
    }

    public void setCorruption(int corruption)
    {
        this.corruption = corruption;
    }

    public int getProductivity()
    {
        return productivity;
    }

    public void setProductivity(int productivity)
    {
        this.productivity = productivity;
    }

    public int getSociety()
    {
        return society;
    }

    public void setSociety(int society)
    {
        this.society = society;
    }

    public int getLaw()
    {
        return law;
    }

    public void setLaw(int law)
    {
        this.law = law;
    }

    public int getLore()
    {
        return lore;
    }

    public void setLore(int lore)
    {
        this.lore = lore;
    }

    public int getCrime()
    {
        return crime;
    }

    public void setCrime(int crime)
    {
        this.crime = crime;
    }

    public boolean isSpecial()
    {
        return special;
    }

    public void setSpecial(boolean special)
    {
        this.special=special;
        if(!special)
        {
            specialText="";
        }
    }

    public String getSpecial()
    {
        return specialText;
    }

    public void setSpecial(String specialText)
    {
        if(specialText==null||specialText.equals(""))
        {
            special=false;
            this.specialText="";
        }
        else
        {
            special=true;
            this.specialText=specialText;
        }
    }

    @Override
    public String toString()
    {
        return "{"+id+","+corruption+","+productivity+","+society+","+law+","+lore+","+crime+","+special+","+specialText+"}";
    }
}
