package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 10/3/16.
 */

public class Building
{
    private int id;
    private String name;
    private int economy;
    private int loyalty;
    private int stability;
    private int unrest;
    private int corruption;
    private int crime;
    private int law;
    private int lore;
    private int society;
    private int population;
    private int fame;
    private double infamy;
    private int baseValue;
    private int level;
    private int productivity;
    private int lots;
    private int cost;
    private int buildTime;
    private boolean special;
    private String specialText;

    public Building(int id,String name,int economy, int loyalty, int stability, int unrest, int corruption, int crime, int law, int lore, int society, int population, int fame, double infamy, int baseValue, int level, int productivity, int lots, int cost, int buildTime,boolean special,String specialText)
    {
        this.id=id;
        this.name=name;
        this.economy=economy;
        this.loyalty=loyalty;
        this.stability=stability;
        this.unrest=unrest;
        this.corruption=corruption;
        this.crime=crime;
        this.law=law;
        this.lore=lore;
        this.society=society;
        this.population=population;
        this.fame=fame;
        this.infamy=infamy;
        this.baseValue=baseValue;
        this.level=level;
        this.productivity=productivity;
        this.lots=lots;
        this.cost=cost;
        this.buildTime=buildTime;
        this.special=special;
        this.specialText=specialText;
    }

    public Building(BuildStat b)
    {
        this.id=b.ordinal();
        this.name=b.name().toLowerCase();
        this.economy=b.economy;
        this.loyalty=b.loyalty;
        this.stability=b.stability;
        this.unrest=b.unrest;
        this.corruption=b.corruption;
        this.crime=b.crime;
        this.law=b.law;
        this.lore=b.lore;
        this.society=b.society;
        this.population=b.population;
        this.fame=b.fame;
        this.infamy=b.infamy;
        this.baseValue=b.baseValue;
        this.level=b.level;
        this.productivity=b.productivity;
        this.lots=b.lots;
        this.cost=b.cost;
        this.buildTime=b.buildTime;
        this.special=b.special;
        this.specialText=b.specialText;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getEconomy()
    {
        return economy;
    }

    public void setEconomy(int economy)
    {
        this.economy=economy;
    }

    public int getLoyalty()
    {
        return loyalty;
    }

    public void setLoyalty(int loyalty)
    {
        this.loyalty=loyalty;
    }

    public int getStability()
    {
        return stability;
    }

    public void setStability(int stability)
    {
        this.stability=stability;
    }

    public int getUnrest()
    {
        return unrest;
    }

    public void setUnrest(int unrest)
    {
        this.unrest=unrest;
    }

    public int getCorruption()
    {
        return corruption;
    }

    public void setCorruption(int corruption)
    {
        this.corruption=corruption;
    }

    public int getCrime()
    {
        return crime;
    }

    public void setCrime(int crime)
    {
        this.crime=crime;
    }

    public int getLaw()
    {
        return law;
    }

    public void setLaw(int law)
    {
        this.law=law;
    }

    public int getLore()
    {
        return lore;
    }

    public void setLore(int lore)
    {
        this.lore=lore;
    }

    public int getSociety()
    {
        return society;
    }

    public void setSociety(int society)
    {
        this.society=society;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population=population;
    }

    public int getFame()
    {
        return fame;
    }

    public void setFame(int fame)
    {
        this.fame=fame;
    }

    public double getInfamy()
    {
        return infamy;
    }

    public void setInfamy(double infamy)
    {
        this.infamy=infamy;
    }

    public int getBaseValue()
    {
        return baseValue;
    }

    public void setBaseValue(int baseValue)
    {
        this.baseValue=baseValue;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level=level;
    }

    public int getProductivity()
    {
        return productivity;
    }

    public void setProductivity(int productivity)
    {
        this.productivity=productivity;
    }

    public int getLots()
    {
        return lots;
    }

    public void setLots(int lots)
    {
        this.lots=lots;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost=cost;
    }

    public int getBuildTime()
    {
        return buildTime;
    }

    public void setBuildTime(int buildTime)
    {
        this.buildTime=buildTime;
    }

    @Override
    public String toString()
    {
        //TODO: add toString
        return "{"+id+","+name+","+economy+","+loyalty+","+stability+","+unrest+","+corruption+","+crime+","+law+","+lore+","+society+","+population+","+fame+","+infamy+","+baseValue+","+level+","+productivity+","+lots+","+cost+","+buildTime+"}";
    }

    public boolean isSpecial()
    {
        return special;
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
}
