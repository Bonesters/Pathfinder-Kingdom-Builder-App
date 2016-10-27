package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public enum BuildStat
{
    ACADEMY(2,2,0,0,0,0,0,2,2,100,0,0,0,2,1,2,24,4,true,"Special: increase Lore bonus by 2 for questions relating to one Knowledge or Profession skill."),
    AERIE(0,0,2,-1,0,0,0,0,0,10,0,0,0,1,0,1,18,3,true,"Special: +2 bonus to Stability checks against Monster\n"+"Attacks involving flying creatures."),
    ALCHEMIST(1,0,0,0,0,0,0,0,0,10,0,0,1000,1,0,1,18,3,false,""),
    ARENA(0,0,4,0,0,1,0,0,0,100,1,0,0,2,0,4,40,10,true,"Limit: 1 per settlement."),
    ASSEMBLY(2,1,0,0,0,0,1,0,2,50,1,0,0,2,0,2,30,6,true,"Limit: 1 per city\nSpecial: When you issue an Improvement Edict, you can build one additional building in a city with an Assembly or one additional terrain improvement in a hex containing that city or adjacent to it."),
    BANK(4,0,0,0,0,0,0,0,0,10,0,0,2000,2,0,1,28,7,false,""),
    BARDIC_COLLEGE(1,3,1,0,0,0,0,0,0,50,1,0,0,2,0,2,40,8,false,""),
    BARRACKS(0,0,0,-1,0,0,1,0,0,20,0,0,0,0,0,1,6,1,false,""),
    BATHS(1,0,1,0,0,0,0,0,0,20,0,0,0,1,0,1,4,1,true,"Limit: Adjacent to a Waterway or water border. This requirement can be ignored by doubling the construction cost of the Baths."),
    BLACK_MARKET(2,0,-1,1,2,2,0,0,0,20,0,0,2000,2,0,1,50,5,false,""),
    BREWERY(0,1,1,0,0,0,0,0,0,20,0,0,0,0,0,1,6,1,false,""),
    BRICKYARD(1,0,1,0,0,0,0,0,0,50,0,0,0,0,1,2,16,4,true,"Special: The cost to construct Quarries in the settlement’s hex or adjacent hexes is reduced to 6 BP. In addition, Quarries in those hexes generate 1 additional BP for every 2 Quarries. If a Quarry is adjacent to two settlements with Brickyards, only one Brickyard may benefit from that Quarry each kingdom turn."),
    BORDELLO(1,1,0,0,1,1,0,0,0,20,0,1/3,0,1,0,1,4,1,true,"Special: Each Bordello causes a -1 penalty to Stability checks to resist Drug Den and Plague events."),
    BRIDGE(1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,6,1,true,"Special: Shares the space with a river or Waterway lot. Allows travel across a river or Waterway, easing transportation."),
    BUERAU(1,-1,1,0,1,0,1,0,0,20,0,0,0,2,0,2,10,2,false,""),
    CASTERs_TOWER(1,1,0,0,0,0,0,0,0,10,0,0,0,1,0,1,36,6,false,""),
    CASTLE(2,2,2,-4,0,0,0,0,0,200,1,0,0,1,0,4,60,12,true,"Limit: 1 per settlement."),
    CATHEDRAL(0,4,4,-4,0,0,2,0,0,100,1,0,0,2,0,4,60,12,true,"Limit: 1 per settlement.\nSpecial: Halves Consumption increase for Promotion Edicts."),
    CISTERN(0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,6,1,true,"Limit: Cannot be adjacent to a Dump, Graveyard, Stable, Stockyard, or Tannery.\nSpecial: Can share lot with another building."),
    CITY_WALLS(0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,2,1,true,"Limit: Land district border.\nThe GM may allow for cliffs and other natural features to function as a City Wall for one or more sides of a district. You may construct gates through your own city wall at no cost."),
    COLOSSUS(2,4,2,-2,0,0,2,0,0,0,1,0,0,2,0,4,60,12,true,"Limit: 1 per settlement.\nSpecial: When your armies in the same hex as a settlement with a Colossus, they gain a +1 bonus to Morale; if they are inside the city, they gain a +2 bonus. A Colossus can share the same space as a Lighthouse or Observatory (but not both)."),
    COURTHOUSE(0,2,0,0,-1,-1,2,0,0,20,0,0,0,1,0,1,16,4,false,""),
    CREMATORIUM(0,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,4,1,true,"Special: +2 bonus to Stability checks against Plague events or Monster Attacks involving undead."),
    DANCE_HALL(1,2,0,1,1,1,0,0,0,30,0,0,0,0,0,1,4,1,false,""),
    DUMP(0,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,4,1,false,""),
    EXOTIC_ARTISAN(1,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,10,2,false,""),
    FOREIGN_QUARTER(3,0,-1,0,0,1,0,1,2,100,0,0,0,2,0,4,30,6,true,"Special: Increase the value of trade routes (see Trade Edicts) by 5% (maximum 100%)."),
    FOUNDRY(1,0,1,1,0,0,0,0,0,50,0,0,0,1,1,2,16,4,true,"Special: Increase the Economy and BP earned per turn by 1 for 1 Mine connected to this settlement by a river or Road."),
    GAMBLING_DEN(2,0,0,1,1,1,0,0,0,20,0,1/3,500,1,0,1,10,2,true,"Special: Each Gambling Den causes a -1 penalty to Stability checks to resist Drug Den events."),
    GARRISON(0,2,2,-1,0,0,0,0,0,200,0,0,0,1,0,2,30,6,false,""),
    GRANARY(0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,10,2,true,"Special: If Farms reduce Consumption below 0, store up to 5 BP of excess production for use on a later turn when Consumption exceeds the Treasury."),
    GRAVEYARD(0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,4,1,false,""),
    GUILDHALL(2,2,0,0,0,0,1,0,0,100,0,0,1000,1,2,2,36,6,false,""),
    HANGING_GARDENS(2,2,0,-2,0,0,0,1,2,20,1,0,0,2,0,4,48,12,true,"Limit: 1 per settlement.\nSpecial: Reduces Consumption in the city by 1."),
    HERBALIST(0,1,1,0,0,0,0,0,0,10,0,0,0,0,0,1,12,2,false,""),
    HOSPITAL(0,1,2,0,0,0,0,1,0,100,0,0,0,2,2,2,30,6,true,"Special: Increase Stability by 2 during plague events."),
    HOUSE(0,0,0,-1,0,0,0,0,0,50,0,0,0,0,0,1,4,1,true,"Special: The first House you build during the Improvement phase does not count against the total number of buildings you can build during the phase."),
    INN(1,1,0,0,0,0,0,0,1,30,0,0,500,0,0,1,10,2,false,""),
    JAIL(0,2,2,-2,0,-1,1,0,0,50,0,0,0,0,0,1,14,2,false,""),
    LIBRARY(1,1,0,0,0,0,0,1,0,10,0,0,0,0,0,1,8,2,false,""),
    LIGHTHOUSE(2,0,2,0,0,0,0,0,0,10,0,0,0,1,0,1,24,4,true,"Limit: 1 per settlement; must be on a water border at the edge of a district grid.\nSpecial: The cost to create Fisheries in hexes adjacent to the settlement is reduced to 3 BP.\nSpecial: If you establish a trade route from a city with a Lighthouse, water hexes count as one-fourth (rather than one-half) when calculating Trade Route Length."),
    LUMBERYARD(1,0,1,0,0,0,0,0,0,50,0,0,0,0,1,2,12,2,true,"Special: The cost to construct Sawmills in the settlement’s hex or adjacent hexes is reduced to 2 BP. In addition, Sawmills in those hexes generate 1 additional BP for every 2 Sawmills. If a Sawmill is adjacent to two settlements with Lumberyards, only one Lumberyard may benefit from that Sawmill each kingdom turn."),
    LUXURY_STORE(1,0,0,0,0,0,0,0,0,10,0,0,2000,1,0,1,28,4,false,""),
    MAGIC_SHOP(1,0,0,0,0,0,0,0,0,10,0,0,2000,2,0,1,66,11,false,""),
    MAGICAL_ACADEMY(2,0,0,0,0,0,0,2,1,50,1,0,0,2,0,2,60,10,true,"Special: increase Lore bonus by 2 for questions relating to Knowledge (arcana)."),
    MAGICAL_STREETLAMPS(0,0,0,0,0,-1,0,0,0,0,0,0,0,1,0,0,5,1,false,"Limit: Settlement must have a Cathedral, Magic Shop, Magical Academy, or Temple.\nSpecial: Can share a lot with any building or improvement."),
    MANSION(0,0,1,0,0,0,1,0,1,30,0,0,0,0,0,1,10,2,true,"Special: Counts as House for buildings that must be adjacent to a House."),
    MARKET(2,0,2,0,0,0,0,0,0,100,0,0,2000,1,0,2,48,8,false,""),
    MENAGERIE(1,0,0,0,0,0,0,0,0,100,1,0,0,2,0,4,16,4,true,"Special: Increase Loyalty by 1/4 the CR of the highest-CR creature in the Menagerie."),
    MILITARY_ACADEMY(0,2,1,0,0,0,1,1,0,100,1,0,0,1,0,2,36,6,true,"Limit: 1 per settlement.\n"+"Special: Armies and commanders recruited at the settlement gain one bonus tactic (see Army Tactics http://www.d20pfsrd.com/gamemastering/other-rules/mass-combat#TOC-Army-Tactics)."),
    MILL(1,0,1,0,0,0,0,0,0,20,0,0,0,0,1,1,8,2,false,""),
    MINT(3,3,1,0,0,0,0,0,0,10,1,0,0,2,0,1,30,5,false,""),
    //TODO: the unrest -1 from a moat should only be applied once. make sure to factor that into the statistic calculations.
    MOAT(0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,2,1,true,"Limit: Land district border.\nSpecial: The Unrest -1 bonus only applies once per settlement.\nSpecial: Cannot be damaged by siege engines."),
    MONASTERY(0,0,1,0,0,0,1,1,0,50,0,0,0,0,0,2,16,4,false,""),
    MONUMENT(0,1,0,-1,0,0,0,0,0,0,0,0,0,0,0,1,6,1,false,""),
    MUSEUM(1,1,0,0,0,0,0,2,1,20,1,0,0,1,0,2,30,5,true,"Special: Increase Lore bonus by 2 for questions relating to Knowledge (history); apply Lore bonus on Appraise checks regarding art objects.\nSpecial: The GM may allow the kingdom leaders to display a valuable item (such as a magic item or bejeweled statue) in the museum, increasing Fame during this display by 1 for every 10,000 gp of the item's price (maximum +5 Fame), and by an additional 1 if the item is significant to the kingdom's history."),
    NOBLE_VILLA(1,1,1,0,0,0,0,0,1,50,1,0,0,1,0,2,24,4,true,"Special: Counts as House for buildings that must be adjacent to a House."),
    OBSERVATORY(0,0,1,0,0,0,0,2,0,10,0,0,0,2,0,1,12,4,false,""),
    ORPHANAGE(0,0,1,-1,0,0,0,0,0,50,0,0,0,2,0,1,8,2,false,""),
    PALACE(2,6,2,0,0,0,2,0,0,200,1,0,1000,2,0,4,108,18,true,"Special: You may make two special edicts per turn, but take a –2 penalty on kingdom checks associated with each special edict."),
    PARK(0,1,0,-1,0,0,0,0,0,0,0,0,0,1,0,1,4,1,false,""),
    PAVED_STREETS(2,0,1,0,0,0,0,0,0,0,0,0,0,2,2,0,24,6,true,"Limit: 1 per district."),
    PIER(1,0,1,0,0,1,0,0,0,20,0,0,1000,0,0,1,16,4,false,""),
    SACRED_GROVE(0,1,1,-1,0,0,0,0,-1,10,0,0,0,0,0,1,12,3,true,"Limit: Adjacent to Park or to city district border with no City Wall or Moat\nSpecial: +2 bonus to Stability checks against Crop Failure events or Monster Attacks involving animals, plants, or fey.\nSpecial: Each Sacred Grove provides a +1 bonus to Stability checks to resist Plague events."),
    SEWER_SYSTEM(0,1,2,0,0,1,0,0,0,0,0,0,0,2,1,0,24,6,true,"Limit: 1 per district."),
    SHOP(1,0,0,0,0,0,0,0,0,20,0,0,500,0,1,1,8,2,false,""),
    SHRINE(0,1,0,-1,0,0,0,0,0,10,0,0,0,0,0,1,8,2,false,""),
    SMITHY(1,0,1,0,0,0,0,0,0,10,0,0,0,0,0,1,6,1,false,""),
    STABLE(1,1,0,0,0,0,0,0,0,10,0,0,500,0,0,1,10,2,false,""),
    STOCKYARD(1,0,-1,0,0,0,0,0,0,100,0,0,0,0,1,4,20,4,true,"Special: Farms in this hex or adjacent hexes reduce Consumption by 3 instead of 2."),
    TANNERY(1,0,1,0,0,0,0,0,-1,20,0,0,0,0,0,1,6,1,false,""),
    TAVERN(1,1,0,0,1,0,0,0,0,20,0,0,500,0,0,1,12,2,false,""),
    TEMPLE(0,2,2,-2,0,0,0,0,0,50,0,0,0,1,0,2,32,8,false,""),
    TENEMENT(0,0,0,2,0,0,0,0,0,100,0,0,0,1,0,1,1,1,true,"Special: Counts as House for buildings that must be adjacent to a House."),
    THEATER(2,0,2,0,0,0,0,0,0,50,0,0,0,1,0,2,24,6,false,""),
    TOWN_HALL(1,1,1,0,0,0,1,0,0,50,0,0,0,1,0,2,24,4,false,""),
    TRADE_SHOP(1,0,1,0,0,0,0,0,0,10,0,0,500,0,1,1,10,2,false,""),
    TUNNELS(1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,16,2,true,"Special: Tunnels are underground and do not occupy a lot on the surface, but each runs underneath one city square of 4 lots. You can pass through the square of an impassable building by moving through the Tunnels underneath it."),
    UNIVERSITY(3,3,0,0,0,0,0,4,3,200,1,0,0,2,0,4,48,8,true,"Special: Increase Lore bonus by 4 for questions relating to one Knowledge or Profession skill."),
    WAREHOUSE(1,0,0,0,0,0,0,0,0,20,0,0,0,1,1,2,16,2,true,"Limit: Adjacent to a water border or a Guildhall, Market, Pier, Trade Shop, or Waterfront."),
    WATCHTOWER(0,0,1,-1,0,0,0,0,0,20,0,0,0,0,0,1,12,2,false,""),
    WATERFRONT(4,0,0,0,0,0,0,0,0,200,0,0,4000,2,2,4,72,12,true,"Limit: Adjacent to water district border.\nLimit: 1 per settlement.\nSpecial: Halves Loyalty penalty for Taxation edicts."),
    WATERGATE(0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,2,1,true,"Special: Shares City Wall. \nSpecial: If you construct a Watergate when you construct a City Wall, the Watergate does not count toward the limit of the number of buildings you can construct per turn."),
    WATERWAY(0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,3,1,true,"Limit: If you construct a City Wall that touches or crosses the Waterway, you must also build Watergates on the same turn.\nSpecial: Can be one or two lots in size for the same cost.\nSpecial: At the GM's option, a natural Waterway may already exist on the grid, requiring no action or BP to build. "),
    WINDMILL(1,0,0,0,0,0,0,0,0,10,0,0,0,0,1,1,16,2,true,"Special: A Windmill adjacent to a Cistern or Granary increases the Stability bonus provided by that building by +1.");

    public final int economy;
    public final int loyalty;
    public final int stability;
    public final int unrest;
    public final int corruption;
    public final int crime;
    public final int law;
    public final int lore;
    public final int society;
    public final int population;
    public final int fame;
    public final double infamy;
    public final int baseValue;
    public final int level;
    public final int productivity;
    public final int lots;
    public final int cost;
    public final int buildTime;
    public final boolean special;
    public final String specialText;

    BuildStat(int economy, int loyalty, int stability, int unrest, int corruption, int crime, int law, int lore, int society, int population, int fame, double infamy, int baseValue, int level, int productivity, int lots, int cost, int buildTime,boolean special,String specialText)
    {
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

    public boolean hasLimit()
    {
        return this.getHousesRequired()>=0||this.specialText.contains("Limit: ");
    }

    public boolean hasSpecial()
    {
        return this.specialText.contains("Special: ");
    }

    /**
     *
     * @return -1 for no requirement, 0 for no adjacent houses allowed, else minimum house requirement
     */
    public int getHousesRequired()
    {
        switch (this)
        {
            case ALCHEMIST:{return 1;}
            case BLACK_MARKET:{return 2;}
            case DANCE_HALL:{return 1;}
            case DUMP:{return 0;}
            case EXOTIC_ARTISAN:{return 1;}
            case HERBALIST:{return 0;}
            case INN:{return 0;}
            case LUXURY_STORE:{return 1;}
            case MAGIC_SHOP:{return 2;}
            case MARKET:{return 2;}
            case SHOP:{return 1;}
            case STABLE:{return 1;}
            case TANNERY:{return 0;}
            case TAVERN:{return 1;}
            case TRADE_SHOP:{return 1;}
            default:{return -1;}
        }
    }

    public boolean requiresWater()
    {
        switch(this)
        {
            case FOUNDRY:{return true;}
            case MILL:{return true;}
            case PIER:{return true;}
            case WATERFRONT:{return true;}
            case WATERWAY:{return true;}
            default:{return false;}
        }
    }

    @Override
    public String toString()
    {
        return (new Building(this)).toString();
    }

    public String getUpgrades()
    {
        BuildStat[] upgrade;
        switch(this)
        {
            case ACADEMY:{upgrade=new BuildStat[]{UNIVERSITY};break;}
            case BARRACKS:{upgrade=new BuildStat[]{GARRISON};break;}
            case LIBRARY:{upgrade=new BuildStat[]{ACADEMY};break;}
            case LUXURY_STORE:{upgrade=new BuildStat[]{MAGIC_SHOP};break;}
            case MANSION:{upgrade=new BuildStat[]{NOBLE_VILLA};break;}
            case PIER:{upgrade=new BuildStat[]{WATERFRONT};break;}
            case SHOP:{upgrade=new BuildStat[]{LUXURY_STORE,MARKET};break;}
            case SHRINE:{upgrade=new BuildStat[]{TEMPLE};break;}
            case TENEMENT:{upgrade=new BuildStat[]{HOUSE};break;}
            case THEATER:{upgrade=new BuildStat[]{ARENA};break;}
            case TRADE_SHOP:{upgrade=new BuildStat[]{TOWN_HALL};break;}
            default:{return "";}
        }
        String s="{";
        for(BuildStat b:upgrade)
        {
            s+=b.name().toLowerCase().replace("_"," ")+",";
        }
        s=s.substring(0,s.length()-1)+"}";
        return s;
    }

    public String getDiscounts()
    {
        BuildStat[] discount;
        switch(this)
        {
            case ACADEMY:{discount=new BuildStat[]{CASTERs_TOWER,LIBRARY,MAGIC_SHOP};break;}
            case ARENA:{discount=new BuildStat[]{DANCE_HALL,GARRISON,INN,STABLE,THEATER};break;}
            case BARDIC_COLLEGE:{discount=new BuildStat[]{LIBRARY,MUSEUM,THEATER};break;}
            case BLACK_MARKET:{discount=new BuildStat[]{DANCE_HALL};break;}
            case CASTLE:{discount=new BuildStat[]{NOBLE_VILLA,TOWN_HALL};break;}
            case CATHEDRAL:{discount=new BuildStat[]{ACADEMY,TEMPLE};break;}
            case COLOSSUS:{discount=new BuildStat[]{LIGHTHOUSE,MONUMENT,OBSERVATORY,PARK};break;}
            case COURTHOUSE:{discount=new BuildStat[]{JAIL};break;}
            case FOUNDRY:{discount=new BuildStat[]{SMITHY};break;}
            case GARRISON:{discount=new BuildStat[]{CITY_WALLS,GRANARY,JAIL};break;}
            case GUILDHALL:{discount=new BuildStat[]{PIER,STABLE,TRADE_SHOP};break;}
            case HANGING_GARDENS:{discount=new BuildStat[]{MENAGERIE,MONUMENT,PARK,SACRED_GROVE};break;}
            case LIGHTHOUSE:{discount=new BuildStat[]{PIER};break;}
            case MAGICAL_ACADEMY:{discount=new BuildStat[]{CASTERs_TOWER,LIBRARY,MAGIC_SHOP};break;}
            case MARKET:{discount=new BuildStat[]{BLACK_MARKET,INN,SHOP};break;}
            case MILITARY_ACADEMY:{discount=new BuildStat[]{BARRACKS};break;}
            case NOBLE_VILLA:{discount=new BuildStat[]{EXOTIC_ARTISAN,LUXURY_STORE,MANSION};break;}
            case PALACE:{discount=new BuildStat[]{MANSION,MINT,NOBLE_VILLA};break;}
            case SEWER_SYSTEM:{discount=new BuildStat[]{CISTERN,DUMP};break;}
            case STOCKYARD:{discount=new BuildStat[]{STABLE,TANNERY};break;}
            case TEMPLE:{discount=new BuildStat[]{GRAVEYARD,MONUMENT,SHRINE};break;}
            case THEATER:{discount=new BuildStat[]{DANCE_HALL,EXOTIC_ARTISAN,INN,PARK,TAVERN};break;}
            case TOWN_HALL:{discount=new BuildStat[]{BARRACKS,CISTERN,DUMP,JAIL,WATCHTOWER};break;}
            case UNIVERSITY:{discount=new BuildStat[]{ACADEMY,BARDIC_COLLEGE,LIBRARY,MAGICAL_ACADEMY,MILITARY_ACADEMY,MUSEUM};break;}
            case WATERFRONT:{discount=new BuildStat[]{BLACK_MARKET,GUILDHALL,PIER};break;}
            default:{return "";}
        }
        String s="";
        for(BuildStat b:discount)
        {
            s+=b.name().toLowerCase().replace("_"," ")+",";
        }
        s="{"+s.substring(0,s.length()-1)+"}";
        return s;
    }

}
