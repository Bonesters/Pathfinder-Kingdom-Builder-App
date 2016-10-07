package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
 * @deprecated replaced by class Building
 */
public class BuildingOld
{
    private boolean hasStreetLamps=false;
    private boolean hasCistern=false;
    private boolean hasEverflowingSpring=false;
    private BuildStat b;

    public BuildingOld(BuildStat b)
    {
        this.b=b;
    }

    public boolean isSameType(BuildStat B)
    {
        return (b.compareTo(B)==0);
    }

    public String getName()
    {
        return b.name();
    }

    public BuildStat getBuildStat()
    {
        return b;
    }

    public int getMonthlyCost()
    {
        return getCost() / getBuildTime();
    }

    public int getEconomy()
    {
        return b.economy;
    }

    public int getLoyalty()
    {
        return b.loyalty;
    }

    public int getStability()
    {
        return b.stability+((hasCistern)?1:0);
    }

    public int getUnrest()
    {
        return b.unrest;
    }

    public int getCorruption()
    {
        return b.corruption;
    }

    public int getCrime()
    {
        return b.crime-((hasStreetLamps)?1:0);
    }

    public int getLaw()
    {
        return b.law;
    }

    public int getLore()
    {
        return b.lore;
    }

    public int getSociety()
    {
        return b.society;
    }

    public int getPopulation()
    {
        return b.population;
    }

    public int getFame()
    {
        return b.fame;
    }

    public double getInfamy()
    {
        return b.infamy;
    }

    public int getBaseValue()
    {
        return b.baseValue;
    }

    public int getLevel()
    {
        return b.level;
    }

    public int getProductivity()
    {
        return b.productivity;
    }

    public int getLots()
    {
        return b.lots;
    }

    public int getCost()
    {
        return b.cost;
    }

    public int getBuildTime()
    {
        return b.buildTime;
    }

    public boolean HasStreetLamps()
    {
        return hasStreetLamps;
    }

    public void setStreetLamps(boolean hasStreetLamps)
    {
        this.hasStreetLamps=hasStreetLamps;
    }

    public boolean HasCistern()
    {
        return hasCistern;
    }

    public void setHasCistern(boolean hasCistern) {
        this.hasCistern = hasCistern;
    }

    public boolean HasEverflowingSpring()
    {
        return hasEverflowingSpring;
    }

    public void setHasEverflowingSpring(boolean hasEverflowingSpring)
    {
        this.hasEverflowingSpring=hasEverflowingSpring;
    }

}
