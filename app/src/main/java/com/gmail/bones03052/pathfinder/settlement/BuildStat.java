package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public enum BuildStat
{
    ACADEMY(2,2,0,0,0,0,0,2,2,100,0,0,0,2,1,2,24,4,false,""),
    AERIE(0,0,2,-1,0,0,0,0,0,10,0,0,0,1,0,1,18,3,false,""),
    ALCHEMIST(1,0,0,0,0,0,0,0,0,10,0,0,1000,1,0,1,18,3,false,""),
    ARENA(0,0,4,0,0,1,0,0,0,100,1,0,0,2,0,4,40,10,false,""),
    ASSEMBLY(2,1,0,0,0,0,1,0,2,50,1,0,0,2,0,2,30,6,false,""),
    BANK(4,0,0,0,0,0,0,0,0,10,0,0,2000,2,0,1,28,7,false,""),
    BARDIC_COLLEGE(1,3,1,0,0,0,0,0,0,50,1,0,0,2,0,2,40,8,false,""),
    BARRACKS(0,0,0,-1,0,0,1,0,0,20,0,0,0,0,0,1,6,1,false,""),
    BATHS(1,0,1,0,0,0,0,0,0,20,0,0,0,1,0,1,4,1,false,""),
    BLACK_MARKET(2,0,-1,1,2,2,0,0,0,20,0,0,2000,2,0,1,50,5,false,""),
    BREWERY(0,1,1,0,0,0,0,0,0,20,0,0,0,0,0,1,6,1,false,""),
    BRICKYARD(1,0,1,0,0,0,0,0,0,50,0,0,0,0,1,2,16,4,false,""),
    BORDELLO(1,1,0,0,1,1,0,0,0,20,0,1/3,0,1,0,1,4,1,false,""),
    BRIDGE(1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,6,1,false,""),
    BUERAU(1,-1,1,0,1,0,1,0,0,20,0,0,0,2,0,2,10,2,false,""),
    CASTERs_TOWER(1,1,0,0,0,0,0,0,0,10,0,0,0,1,0,1,36,6,false,""),
    CASTLE(2,2,2,-4,0,0,0,0,0,200,1,0,0,1,0,4,60,12,false,""),
    CATHEDRAL(0,4,4,-4,0,0,2,0,0,100,1,0,0,2,0,4,60,12,false,""),
    CISTERN(0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,6,1,false,""),
    CITY_WALLS(0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,2,1,false,""),
    COLOSSUS(2,4,2,-2,0,0,2,0,0,0,1,0,0,2,0,4,60,12,false,""),
    COURTHOUSE(0,2,0,0,-1,-1,2,0,0,20,0,0,0,1,0,1,16,4,false,""),
    CREMATORIUM(0,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,4,1,false,""),
    DANCE_HALL(1,2,0,1,1,1,0,0,0,30,0,0,0,0,0,1,4,1,false,""),
    DUMP(0,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,4,1,false,""),
    EXOTIC_ARTISAN(1,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,10,2,false,""),
    FOREIGN_QUARTER(3,0,-1,0,0,1,0,1,2,100,0,0,0,2,0,4,30,6,false,""),
    FOUNDRY(1,0,1,1,0,0,0,0,0,50,0,0,0,1,1,2,16,4,false,""),
    GAMBLING_DEN(2,0,0,1,1,1,0,0,0,20,0,1/3,500,1,0,1,10,2,false,""),
    GARRISON(0,2,2,-1,0,0,0,0,0,200,0,0,0,1,0,2,30,6,false,""),
    GRANARY(0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,10,2,false,""),
    GRAVEYARD(0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,4,1,false,""),
    GUILDHALL(2,2,0,0,0,0,1,0,0,100,0,0,1000,1,2,2,36,6,false,""),
    HANGING_GARDENS(2,2,0,-2,0,0,0,1,2,20,1,0,0,2,0,4,48,12,false,""),
    HERBALIST(0,1,1,0,0,0,0,0,0,10,0,0,0,0,0,1,12,2,false,""),
    HOSPITAL(0,1,2,0,0,0,0,1,0,100,0,0,0,2,2,2,30,6,false,""),
    HOUSE(0,0,0,-1,0,0,0,0,0,50,0,0,0,0,0,1,4,1,false,""),
    INN(1,1,0,0,0,0,0,0,1,30,0,0,500,0,0,1,10,2,false,""),
    JAIL(0,2,2,-2,0,-1,1,0,0,50,0,0,0,0,0,1,14,2,false,""),
    LIBRARY(1,1,0,0,0,0,0,1,0,10,0,0,0,0,0,1,8,2,false,""),
    LIGHTHOUSE(2,0,2,0,0,0,0,0,0,10,0,0,0,1,0,1,24,4,false,""),
    LUMBERYARD(1,0,1,0,0,0,0,0,0,50,0,0,0,0,1,2,12,2,false,""),
    LUXURY_STORE(1,0,0,0,0,0,0,0,0,10,0,0,2000,1,0,1,28,4,false,""),
    MAGIC_SHOP(1,0,0,0,0,0,0,0,0,10,0,0,2000,2,0,1,66,11,false,""),
    MAGICAL_ACADEMY(2,0,0,0,0,0,0,2,1,50,1,0,0,2,0,2,60,10,false,""),
    MAGICAL_STREETLAMPS(0,0,0,0,0,-1,0,0,0,0,0,0,0,1,0,0,5,1,false,""),
    MANSION(0,0,1,0,0,0,1,0,1,30,0,0,0,0,0,1,10,2,false,""),
    MARKET(2,0,2,0,0,0,0,0,0,100,0,0,2000,1,0,2,48,8,false,""),
    MENAGERIE(1,0,0,0,0,0,0,0,0,100,1,0,0,2,0,4,16,4,false,""),
    MILITARY_ACADEMY(0,2,1,0,0,0,1,1,0,100,1,0,0,1,0,2,36,6,false,""),
    MILL(1,0,1,0,0,0,0,0,0,20,0,0,0,0,1,1,8,2,false,""),
    MINT(3,3,1,0,0,0,0,0,0,10,1,0,0,2,0,1,30,5,false,""),
    MOAT(0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,2,1,false,""),
    MONASTERY(0,0,1,0,0,0,1,1,0,50,0,0,0,0,0,2,16,4,false,""),
    MONUMENT(0,1,0,-1,0,0,0,0,0,0,0,0,0,0,0,1,6,1,false,""),
    MUSEUM(1,1,0,0,0,0,0,2,1,20,1,0,0,1,0,2,30,5,false,""),
    NOBLE_VILLA(1,1,1,0,0,0,0,0,1,50,1,0,0,1,0,2,24,4,false,""),
    OBSERVATORY(0,0,1,0,0,0,0,2,0,10,0,0,0,2,0,1,12,4,false,""),
    ORPHANAGE(0,0,1,-1,0,0,0,0,0,50,0,0,0,2,0,1,8,2,false,""),
    PALACE(2,6,2,0,0,0,2,0,0,200,1,0,1000,2,0,4,108,18,false,""),
    PARK(0,1,0,-1,0,0,0,0,0,0,0,0,0,1,0,1,4,1,false,""),
    PAVED_STREETS(2,0,1,0,0,0,0,0,0,0,0,0,0,2,2,0,24,6,false,""),
    PIER(1,0,1,0,0,1,0,0,0,20,0,0,1000,0,0,1,16,4,false,""),
    SACRED_GROVE(0,1,1,-1,0,0,0,0,-1,10,0,0,0,0,0,1,12,3,false,""),
    SEWER_SYSTEM(0,1,2,0,0,1,0,0,0,0,0,0,0,2,1,0,24,6,false,""),
    SHOP(1,0,0,0,0,0,0,0,0,20,0,0,500,0,1,1,8,2,false,""),
    SHRINE(0,1,0,-1,0,0,0,0,0,10,0,0,0,0,0,1,8,2,false,""),
    SMITHY(1,0,1,0,0,0,0,0,0,10,0,0,0,0,0,1,6,1,false,""),
    STABLE(1,1,0,0,0,0,0,0,0,10,0,0,500,0,0,1,10,2,false,""),
    STOCKYARD(1,0,-1,0,0,0,0,0,0,100,0,0,0,0,1,4,20,4,false,""),
    TANNERY(1,0,1,0,0,0,0,0,-1,20,0,0,0,0,0,1,6,1,false,""),
    TAVERN(1,1,0,0,1,0,0,0,0,20,0,0,500,0,0,1,12,2,false,""),
    TEMPLE(0,2,2,-2,0,0,0,0,0,50,0,0,0,1,0,2,32,8,false,""),
    TENEMENT(0,0,0,2,0,0,0,0,0,100,0,0,0,1,0,1,1,1,false,""),
    THEATER(2,0,2,0,0,0,0,0,0,50,0,0,0,1,0,2,24,6,false,""),
    TOWN_HALL(1,1,1,0,0,0,1,0,0,50,0,0,0,1,0,2,24,4,false,""),
    TRADE_SHOP(1,0,1,0,0,0,0,0,0,10,0,0,500,0,1,1,10,2,false,""),
    TUNNELS(1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,16,2,false,""),
    UNIVERSITY(3,3,0,0,0,0,0,4,3,200,1,0,0,2,0,4,48,8,false,""),
    WAREHOUSE(1,0,0,0,0,0,0,0,0,20,0,0,0,1,1,2,16,2,false,""),
    WATCHTOWER(0,0,1,-1,0,0,0,0,0,20,0,0,0,0,0,1,12,2,false,""),
    WATERFRONT(4,0,0,0,0,0,0,0,0,200,0,0,4000,2,2,4,72,12,false,""),
    WATERGATE(0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,2,1,false,""),
    WATERWAY(0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,3,1,false,""),
    WINDMILL(1,0,0,0,0,0,0,0,0,10,0,0,0,0,1,1,16,2,false,"");

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

    /*
    building adjacency
        alchemist
            1 house
        black market
            2 house
        cistern
            no dump,graveyard,stable,stockyard,or tannery
        dance hall
            1 house
        dump
            no house
        exotic artisan
            1 house
        foundry
            water district
        herbalist
            1 house
        inn
            1 house
        luxury store
            1 house
        magic shop
            2 house
        market
            2 house
        mill
            water district
        pier
            water district
        shop
            1 house
        stable
            1 house
        tannery
            no house
        tavern
            1 house
        trade shop
            1 house
        waterfront
            water district
        waterway
            water district
     */

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

    /*
    discounts
        academy
            castle's tower,library,magic shop
        arena
            brothel,garrison,inn,stable,theater
        bardic college
            library,museum,theater
        black market
            brothel
        castle
            nobel villa,town hall
        cathedral
            academy,temple
        foundry
            smithy
        garrison
            city wall,granary,jail
        guildhall
            pier,stable,trade shop
        magical academy
            castle's tower,library,magic shop
        market
            black market,inn,shop
        military academy
            barracks
        noble villa
            exotic artisan,luxury store,mansion
        palace
            mansion,mint,noble villa
        sewer system
            cistern,dump
        stockyard
            stable,tannery
        temple
            graveyard,monument,shrine
        theater
            brothel,exotic artisan,inn,park,tavern
        town hall
            barracks,cistern,dump,jail,watchtower
        university
            academy,bardic college,library,magic academy,military academy,museum
        waterfront
            black market,guildhall,market,pier
     */
}
