package com.gmail.bones03052.pathfinder.settlement;

import java.util.LinkedList;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public class Settlement
{
    public static final int LAWFUL_GOOD=0;
    public static final int LAWFUL_NEUTRAL=1;
    public static final int LAWFUL_EVIL=2;
    public static final int NEUTRAL_GOOD=3;
    public static final int NEUTRAL=4;
    public static final int NEUTRAL_EVIL=5;
    public static final int CHAOTIC_GOOD=6;
    public static final int CHAOTIC_NEUTRAL=7;
    public static final int CHAOTIC_EVIL=8;

    private int alignment;
    private TownGovernment gov;
    private LinkedList<Quality> qual;
    private LinkedList<District> districts;
    public Settlement()
    {
        alignment=4;
        gov=new TownGovernment(TownGovernments.AUTOCRACY);
        qual=new LinkedList<Quality>();
        districts=new LinkedList<District>();
    }

    public Settlement(TownGovernment g,LinkedList<Quality> q,LinkedList<District> d,int alignment)
    {
        this.alignment=alignment;
        gov=g;
        qual=q;
        districts=d;
    }

    public void setTownGovernment(TownGovernment g)
    {
        this.gov=g;
    }

    public TownGovernment setTownGovernment()
    {
        return gov;
    }


    public LinkedList<Quality> getQual()
    {
        return qual;
    }

    public void setQual(LinkedList<Quality> qual)
    {
        this.qual=qual;
    }

    public LinkedList<District> getDistricts()
    {
        return districts;
    }

    public void setDistricts(LinkedList<District> districts)
    {
        this.districts=districts;
    }

    public int getEconomy()
    {
        int econ=0;
        econ+=(int)(getProductivity()/10);
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                econ+=b.getEconomy();
            }
        }
        return econ;
    }

    public int getLoyalty()
    {
        int loyal=0;
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                loyal+=b.getLoyalty();
            }
        }
        return loyal;
    }

    public int getStability()
    {
        int stab=0;
        stab+=(int)(getLaw()/10);
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                stab+=b.getStability();
            }
        }
        return stab;
    }

    public int getUnrest()
    {
        int unrest=0;
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                unrest+=b.getUnrest();
            }
        }
        return unrest;
    }

    public int getCorruption()
    {
        int corr=0;
        if(alignment%3==2)
        {
            corr++;
        }
        corr+=gov.getCorruption();
        for(Quality q:qual)
        {
            corr+=q.getCorruption();
        }
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                corr+=b.getCorruption();
            }
        }
        return corr;
    }

    public int getCrime()
    {
        int crime=0;
        if(alignment>=6)
        {
            crime++;
        }
        crime+=gov.getCrime();
        for(Quality q:qual)
        {
            crime+=q.getCrime();
        }
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                crime+=b.getCrime();
            }
        }
        return crime;
    }

    public int getLaw()
    {
        int law=0;
        if(alignment<=2)
        {
            law++;
        }
        law+=gov.getLaw();
        for(Quality q:qual)
        {
            law+=q.getLaw();
        }
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                law+=b.getLaw();
            }
        }
        return law;
    }

    public int getLore()
    {
        int lore=0;

        return lore;
    }

    public int getProductivity()
    {
        int prod=0;
        prod+=gov.getProductivity();
        for(Quality q:qual)
        {
            prod+=q.getProductivity();
        }
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                prod+=b.getProductivity();
            }
        }
        return prod;
    }
}
