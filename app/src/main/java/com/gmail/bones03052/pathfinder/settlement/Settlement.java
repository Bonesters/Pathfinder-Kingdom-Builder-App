package com.gmail.bones03052.pathfinder.settlement;

import java.util.HashSet;
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

    public static final int THORPE=0;
    public static final int HAMLET=1;
    public static final int VILLAGE=2;
    public static final int SMALL_TOWN=3;
    public static final int LARGE_TOWN=4;
    public static final int SMALL_CITY=5;
    public static final int LARGE_CITY=6;
    public static final int METROPOLIS=7;

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

    public int getAlignment()
    {
        return alignment;
    }

    public boolean setAlignment(int alignment)
    {
        if(alignment>=0&&alignment<=8)
        {
            this.alignment=alignment;
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getBaseQualityCount()
    {
        switch(getSize())
        {
            case THORPE:    {return 1;}
            case HAMLET:    {return 1;}
            case VILLAGE:   {return 2;}
            case SMALL_TOWN:{return 2;}
            case LARGE_TOWN:{return 3;}
            case SMALL_CITY:{return 4;}
            case LARGE_CITY:{return 5;}
            case METROPOLIS:{return 6;}
            default:        {return 0;}
        }
    }

    public int getCurrentQualityCount()
    {
        return qual.size();
    }

    public int getBaseDanger()
    {
        switch(getSize())
        {
            case THORPE:    {return -10;}
            case HAMLET:    {return -5;}
            case VILLAGE:   {return 0;}
            case SMALL_TOWN:{return 0;}
            case LARGE_TOWN:{return 5;}
            case SMALL_CITY:{return 5;}
            case LARGE_CITY:{return 10;}
            case METROPOLIS:{return 10;}
            default:        {return 0;}
        }
    }

    public int getDanger()
    {
        int danger=getBaseDanger();
        for(Quality q:qual)
        {
            danger+=q.getDanger();
        }
        return danger;
    }

    public HashSet<String> getBuildingSpecials()
    {
        HashSet<String> specials=new HashSet<>();
        for(District d:getDistricts())
        {
            for(Building b:d.getBuildings())
            {
                specials.add(b.getName()+" : "+b.getSpecial());
            }
        }
        return specials;
    }

    public HashSet<String> getQualitySpecials()
    {
        HashSet<String> specials=new HashSet<>();
        for(Quality q:qual)
        {
            specials.add(q.getName()+" : "+q.getSpecial());
        }
        return specials;
    }

    public String getGovernmentSpecial()
    {
        return gov.getSpecial();
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
        int corr=getSizeMod();
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
        int crime=getSizeMod();
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
        int law=getSizeMod();
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
        int lore=getSizeMod();
        if(alignment%3==1)
        {
            lore++;
            if(alignment==NEUTRAL)
            {
                lore++;
            }
        }
        lore+=gov.getLore();
        for(Quality q:qual)
        {
            lore+=q.getLore();
        }
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                lore+=b.getLore();
            }
        }
        return lore;
    }

    public int getSociety()
    {
        int society=getSizeMod();
        if(alignment%3==0)
        {
            society++;
        }
        society+=gov.getSociety();
        for(Quality q:qual)
        {
            society+=q.getSociety();
        }
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                society+=b.getSociety();
            }
        }
        return society;
    }

    public int getPopulation()
    {
        int pop=0;
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                pop+=b.getPopulation();
            }
        }
        return pop;
    }

    public int getFame()
    {
        int fame=0;
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                fame+=b.getFame();
            }
        }
        return fame;
    }

    public double getInfamy()
    {
        double infamy=0;
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                infamy+=b.getInfamy();
            }
        }
        return infamy;
    }

    public int getBaseValue()
    {
        int bval=getSizeBVal();
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                bval+=b.getBaseValue();
            }
        }
        int bvalmul=1;
        for(Quality q:qual)
        {
            bvalmul+=q.getbValMul();
        }
        bval*=bvalmul;
        return bval;
    }

    public int getProductivity()
    {
        int prod=getSizeMod();
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

    public int getUsedLots()
    {
        int lots=0;
        for(District d:districts)
        {
            for(Building b:d.getBuildings())
            {
                lots+=b.getLots();
            }
        }
        return lots;
    }

    public int getPurchaseValue()
    {
        int pur=getBasePurchaseValue();
        double purMul=1;
        for(Quality q:qual)
        {
            purMul+=q.getPurMul();
        }
        pur*=purMul;
        return pur;
    }

    public int getBasePurchaseValue()
    {
        switch(getSize())
        {
            case THORPE:    {return 500;}
            case HAMLET:    {return 1000;}
            case VILLAGE:   {return 2500;}
            case SMALL_TOWN:{return 5000;}
            case LARGE_TOWN:{return 10000;}
            case SMALL_CITY:{return 25000;}
            case LARGE_CITY:{return 50000;}
            case METROPOLIS:{return 100000;}
            default:        {return 0;}
        }
    }

    public int getBaseSpellcasterLevel()
    {
        int sl=getSize()+1;
        for(Quality q:qual)
        {
            sl+=q.getSpellMod();
        }
        return sl;
    }

    /*
        Thorpe	    Fewer than 20
        Hamlet	    21–60
        Village	    61–200
        Small town	201–2,000
        Large town	2,001–5,000
        Small city	5,001–10,000
        Large city	10,001–25,000
        Metropolis
    */
    public int getSize()
    {
        int pop=getPopulation();
        if(pop<20)
        {
            return THORPE;
        }
        else if(pop<=60)
        {
            return HAMLET;
        }
        else if(pop<=200)
        {
            return VILLAGE;
        }
        else if(pop<=2000)
        {
            return SMALL_TOWN;
        }
        else if(pop<=5000)
        {
            return LARGE_TOWN;
        }
        else if(pop<=10000)
        {
            return SMALL_CITY;
        }
        else if(pop<=25000)
        {
            return LARGE_CITY;
        }
        else
        {
            return METROPOLIS;
        }
    }

    public int getSizeMod()
    {
        switch(getSize())
        {
            case THORPE:    {return -4;}
            case HAMLET:    {return -2;}
            case VILLAGE:   {return -1;}
            case SMALL_CITY:{return 1;}
            case LARGE_CITY:{return 2;}
            case METROPOLIS:{return 4;}
            default:        {return 0;}
        }
    }

    public int getSizeBVal()
    {
        switch(getSize())
        {
            case THORPE:    {return 50;}
            case HAMLET:    {return 200;}
            case VILLAGE:   {return 500;}
            case SMALL_TOWN:{return 1000;}
            case LARGE_TOWN:{return 2000;}
            case SMALL_CITY:{return 4000;}
            case LARGE_CITY:{return 8000;}
            case METROPOLIS:{return 16000;}
            default:        {return 0;}
        }
    }
}
