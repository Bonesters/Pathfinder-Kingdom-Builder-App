package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by dennis on 9/2/16.
 */
public enum BuildStat
{
    ACADEMY(2,2,0,0,0,0,0,2,2,100,0,0,0,2,1,2,24,4),
    AERIE(0,0,2,-1,0,0,0,0,0,10,0,0,0,1,0,1,18,3),
    ALCHEMIST(1,0,0,0,0,0,0,0,0,10,0,0,1000,1,0,1,18,3),
    ARENA(0,0,4,0,0,1,0,0,0,100,1,0,0,2,0,4,40,10),
    ASSEMBLY(2,1,0,0,0,0,1,0,2,50,1,0,0,2,0,2,30,6),
    BANK(4,0,0,0,0,0,0,0,0,10,0,0,2000,2,0,1,28,7),
    BARDIC_COLLEGE(1,3,1,0,0,0,0,0,0,50,1,0,0,2,0,2,40,8),
    BARRACKS(0,0,0,-1,0,0,1,0,0,20,0,0,0,0,0,1,6,1),
    BATHS(1,0,1,0,0,0,0,0,0,20,0,0,0,1,0,1,4,1),
    BLACK_MARKET(2,0,-1,1,2,2,0,0,0,20,0,0,2000,2,0,1,50,5),
    BREWERY(0,1,1,0,0,0,0,0,0,20,0,0,0,0,0,1,6,1),
    BRICKYARD(1,0,1,0,0,0,0,0,0,50,0,0,0,0,1,2,16,4),
    BORDELLO(1,1,0,0,1,1,0,0,0,20,0,1/3,0,1,0,1,4,1),
    BRIDGE(1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,6,1),
    BUERAU(1,-1,1,0,1,0,1,0,0,20,0,0,0,2,0,2,10,2),
    CASTERs_TOWER(1,1,0,0,0,0,0,0,0,10,0,0,0,1,0,1,36,6),
    CASTLE(2,2,2,-4,0,0,0,0,0,200,1,0,0,1,0,4,60,12),
    CATHEDRAL(0,4,4,-4,0,0,2,0,0,100,1,0,0,2,0,4,60,12),
    CISTERN(0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,6,1),
    CITY_WALLS(0,0,0,-2,0,0,0,0,0,0,0,0,0,0,0,0,2,1),
    COLOSSUS(2,4,2,-2,0,0,2,0,0,0,1,0,0,2,0,4,60,12),
    COURTHOUSE(0,2,0,0,-1,-1,2,0,0,20,0,0,0,1,0,1,16,4),
    CREMATORIUM(0,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,4,1),
    DANCE_HALL(1,2,0,1,1,1,0,0,0,30,0,0,0,0,0,1,4,1),
    DUMP(0,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,4,1),
    EXOTIC_ARTISAN(1,0,1,0,0,0,0,0,0,10,0,0,0,1,0,1,10,2),
    FOREIGN_QUARTER(3,0,-1,0,0,1,0,1,2,100,0,0,0,2,0,4,30,6),
    FOUNDRY(1,0,1,1,0,0,0,0,0,50,0,0,0,1,1,2,16,4),
    GAMBLING_DEN(2,0,0,1,1,1,0,0,0,20,0,1/3,500,1,0,1,10,2),
    GARRISON(0,2,2,-1,0,0,0,0,0,200,0,0,0,1,0,2,30,6),
    GRANARY(0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,10,2),
    GRAVEYARD(0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,4,1),
    GUILDHALL(2,2,0,0,0,0,1,0,0,100,0,0,1000,1,2,2,36,6),
    HANGING_GARDENS(2,2,0,-2,0,0,0,1,2,20,1,0,0,2,0,4,48,12),
    HERBALIST(0,1,1,0,0,0,0,0,0,10,0,0,0,0,0,1,12,2),
    HOSPITAL(0,1,2,0,0,0,0,1,0,100,0,0,0,2,2,2,30,6),
    HOUSE(0,0,0,-1,0,0,0,0,0,50,0,0,0,0,0,1,4,1),
    INN(1,1,0,0,0,0,0,0,1,30,0,0,500,0,0,1,10,2),
    JAIL(0,2,2,-2,0,-1,1,0,0,50,0,0,0,0,0,1,14,2),
    LIBRARY(1,1,0,0,0,0,0,1,0,10,0,0,0,0,0,1,8,2),
    LIGHTHOUSE(2,0,2,0,0,0,0,0,0,10,0,0,0,1,0,1,24,4),
    LUMBERYARD(1,0,1,0,0,0,0,0,0,50,0,0,0,0,1,2,12,2),
    LUXURY_STORE(1,0,0,0,0,0,0,0,0,10,0,0,2000,1,0,1,28,4),
    MAGIC_SHOP(1,0,0,0,0,0,0,0,0,10,0,0,2000,2,0,1,66,11),
    MAGICAL_ACADEMY(2,0,0,0,0,0,0,2,1,50,1,0,0,2,0,2,60,10),
    MAGICAL_STREETLAMPS(0,0,0,0,0,-1,0,0,0,0,0,0,0,1,0,0,5,1),
    MANSION(0,0,1,0,0,0,1,0,1,30,0,0,0,0,0,1,10,2),
    MARKET(2,0,2,0,0,0,0,0,0,100,0,0,2000,1,0,2,48,8),
    MENAGERIE(1,0,0,0,0,0,0,0,0,100,1,0,0,2,0,4,16,4),
    MILLITARY_ACADEMY(0,2,1,0,0,0,1,1,0,100,1,0,0,1,0,2,36,6),
    MILL(1,0,1,0,0,0,0,0,0,20,0,0,0,0,1,1,8,2),
    MINT(3,3,1,0,0,0,0,0,0,10,1,0,0,2,0,1,30,5),
    MOAT(0,0,0,-1,0,0,0,0,0,0,0,0,0,0,0,0,2,1),
    MONASTERY(0,0,1,0,0,0,1,1,0,50,0,0,0,0,0,2,16,4),
    MONUMENT(0,1,0,-1,0,0,0,0,0,0,0,0,0,0,0,1,6,1),
    MUSEUM(1,1,0,0,0,0,0,2,1,20,1,0,0,1,0,2,30,5),
    NOBLE_VILLA(1,1,1,0,0,0,0,0,1,50,1,0,0,1,0,2,24,4),
    OBSERVATORY(0,0,1,0,0,0,0,2,0,10,0,0,0,2,0,1,12,4),
    ORPHANAGE(0,0,1,-1,0,0,0,0,0,50,0,0,0,2,0,1,8,2),
    PALACE(2,6,2,0,0,0,2,0,0,200,1,0,1000,2,0,4,108,18),
    PARK(0,1,0,-1,0,0,0,0,0,0,0,0,0,1,0,1,4,1),
    PAVED_STREETS(2,0,1,0,0,0,0,0,0,0,0,0,0,2,2,0,24,6),
    PIER(1,0,1,0,0,1,0,0,0,20,0,0,1000,0,0,1,16,4),
    SACRED_GROVE(0,1,1,-1,0,0,0,0,-1,10,0,0,0,0,0,1,12,3),
    SEWER_SYSTEM(0,1,2,0,0,1,0,0,0,0,0,0,0,2,1,0,24,6),
    SHOP(1,0,0,0,0,0,0,0,0,20,0,0,500,0,1,1,8,2),
    SHRINE(0,1,0,-1,0,0,0,0,0,10,0,0,0,0,0,1,8,2),
    SMITHY(1,0,1,0,0,0,0,0,0,10,0,0,0,0,0,1,6,1),
    STABLE(1,1,0,0,0,0,0,0,0,10,0,0,500,0,0,1,10,2),
    STOCKYARD(1,0,-1,0,0,0,0,0,0,100,0,0,0,0,1,4,20,4),
    TANNERY(1,0,1,0,0,0,0,0,-1,20,0,0,0,0,0,1,6,1),
    TAVERN(1,1,0,0,1,0,0,0,0,20,0,0,500,0,0,1,12,2),
    TEMPLE(0,2,2,-2,0,0,0,0,0,50,0,0,0,1,0,2,32,8),
    TENEMENT(0,0,0,2,0,0,0,0,0,100,0,0,0,1,0,1,1,1),
    THEATER(2,0,2,0,0,0,0,0,0,50,0,0,0,1,0,2,24,6),
    TOWN_HALL(1,1,1,0,0,0,1,0,0,50,0,0,0,1,0,2,24,4),
    TRADE_SHOP(1,0,1,0,0,0,0,0,0,10,0,0,500,0,1,1,10,2),
    TUNNELS(1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,16,2),
    UNIVERSITY(3,3,0,0,0,0,0,4,3,200,1,0,0,2,0,4,48,8),
    WAREHOUSE(1,0,0,0,0,0,0,0,0,20,0,0,0,1,1,2,16,2),
    WATCHTOWER(0,0,1,-1,0,0,0,0,0,20,0,0,0,0,0,1,12,2),
    WATERFRONT(4,0,0,0,0,0,0,0,0,200,0,0,4000,2,2,4,72,12),
    WATERGATE(0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,2,1),
    WATERWAY(0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,3,1),
    WINDMILL(1,0,0,0,0,0,0,0,0,10,0,0,0,0,1,1,16,2);

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

    BuildStat(int economy, int loyalty, int stability, int unrest, int corruption, int crime, int law, int lore, int society, int population, int fame, double infamy, int baseValue, int level, int productivity, int lots, int cost, int buildTime)
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
