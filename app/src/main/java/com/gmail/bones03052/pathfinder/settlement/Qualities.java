package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by dennis on 9/2/16.
 */
public enum Qualities
{
    ABUNDANT(0,1,0,0,0,0,0,0,0,1,0),
    ABSTINENT(2,0,-2,1,0,0,0,0,0,0,0),
    ACADEMIC(0,0,0,0,1,0,1,0,0,0,0),
    ANIMAL_POLYGOT(0,-1,0,0,1,0,1,0,0,1,0),
    ARTISTS_COLONY(0,1,1,0,0,0,0,0,0,1,0),
    ASYLUM(0,0,-2,0,1,0,0,0,0,0,0),
    CITY_OF_THE_DEAD(0,-2,0,1,2,0,0,0,0,1,0),
    CRUEL_WATCH(1,0,-2,2,0,-3,0,0,0,0,0),
    DECADENT(1,1,1,0,0,1,0,0.25,0,0,10),
    DEFENSIBLE(1,2,-1,0,0,1,0,0,0,0,0),
    DESECRATE(0,0,0,0,0,0,0,0,0,1,0),
    HALLOW(0,0,0,0,0,0,0,0,0,1,0),
    ELDRITCH(0,0,0,0,0,0,0,0,0,1,13),
    FAMED_BREEDERS(0,1,0,0,0,0,0,0,0,1,0),
    FINANCIAL_CENTER(0,2,0,1,0,0,0,0.4,0.4,1,0),
    FREE_CITY(0,0,0,-2,0,2,0,0,0,1,5),
    GAMBLING(2,2,0,-1,0,2,0,0,0.1,0,0),
    GOD_RULED(-2,0,-2,0,0,0,0,0,0,1,0),
    GOOD_ROADS(0,2,0,0,0,0,0,0,0,0,0),
    GUILDS(1,1,0,0,-1,0,0,0,0,0,0),
    HOLY_SITE(-2,0,0,0,0,0,2,0,0,0,0),
    INSULAR(0,0,0,1,0,-1,0,0,0,0,0),
    LEGENDARY_MARKETPLACE(0,2,0,0,0,2,0,0,0,1,0),
    LIVING_FOREST(0,-4,2,0,1,-2,0,0,0,1,0),
    MAGICALLY_ATTUNED(0,0,0,0,0,0,2,0.2,0.2,0,0),
    MAGICAL_POLYGOT(0,1,1,0,1,0,0,0,0,1,0),
    MAJESTIC(0,0,0,0,0,0,1,0,0,1,0),
    MOBILE_FRONTLINES(-1,-1,-1,0,0,0,0,0,0,1,0),
    MOBILE_SANCTUARY(0,1,-1,0,0,0,0,0,0,1,0),
    MORALLY_PERMISSIVE(1,1,0,0,0,0,0,0,0,1,0),
    NOTORIOUS(0,0,0,-1,0,1,0,0.3,0.5,0,10),
    PEACEBONDING(0,0,0,1,0,-1,0,0,0,1,0),
    PHANTASMAL(0,-2,-2,0,0,0,0,0,0,1,0),
    PIOUS(0,0,0,0,0,0,1,0,0,1,0),
    PLANAR_CROSSROADS(0,2,0,0,0,3,2,0,0.25,1,20),
    PLANNED_COMMUNITY(0,1,-1,0,0,-1,0,0,0,0,0),
    POCKET_UNIVERSE(0,-2,0,0,0,0,2,0,0,1,0),
    POPULATION_SURGE(0,0,2,0,0,1,0,0,0,0,0),
    PROSPEROUS(0,1,0,0,0,0,0,0.3,0.5,0,0),
    RACIALLY_INTOLERANT(0,0,0,0,0,0,0,0,0,1,0),
    RACIAL_ENCLAVE(0,0,-1,0,0,0,0,0,0,1,0),
    RESETTLED_RUINS(0,1,0,0,1,0,0,0,0,1,0),
    RELIGIOUS_TOLERANCE(0,0,1,0,1,0,0,0,0,1,0),
    ROMANTIC(0,0,1,0,0,0,0,0,0,1,0),
    ROYAL_ACCOMIDATIONS(0,1,-1,2,0,0,0,0,0,1,0),
    RUMORMONGERING_CITIZENS(0,0,-1,0,1,0,0,0,0,0,0),
    RURAL(0,-1,0,0,0,-1,0,0,0,0,-5),
    SACRED_ANIMALS(-1,-1,0,0,1,0,0,0,0,1,0),
    SEXIST(0,0,-2,0,0,0,0,0,0,1,0),
    SLUMBERING_MONSTER(0,0,1,0,2,0,2,0,0,1,0),
    SMALL_FOLK_SETTLEMENT(0,0,0,1,1,0,0,0,0,1,0),
    STRATEGIC_LOCATION(0,1,0,0,0,0,0,0.1,0,0,0),
    SUPERSTITIOUS(0,0,2,2,0,-4,-2,0,0,0,0),
    THERAPEUTIC(0,1,0,0,1,0,0,0,0,1,0),
    TRADING_POST(0,0,0,0,0,0,0,0,1,0,0),
    TOURIST_ATTRACTION(0,1,0,0,0,0,0,0.2,0,0,0),
    UNAGING(0,0,-3,0,4,0,0,0,0,1,0),
    UNDERCITY(0,0,0,0,1,0,0,0,0,0,20),
    UNHOLY_SITE(2,0,0,0,0,0,2,0,0,0,0),
    UNTAMED(0,0,0,0,0,0,0,0,0,1,0),
    WELL_EDUCATED(0,0,1,0,1,0,0,0,0,0,0);

    public final double CORRUPTION;
    public final double PRODUCTIVITY;
    public final double SOCIETY;
    public final double LAW;
    public final double LORE;
    public final double CRIME;
    public final double SPELL_MODIFIER;
    public final double BASE_VALUE_MULTIPLIER;
    public final double PURCHASE_MULTIPLIER;
    public final double DANGER_MODIFIER;
    public final boolean SPECIAL;

    private Qualities(double corruption,double productivity,double society,double law,double lore,double crime,double sp,double bvm,double pm,int special,double danger)
    {
        this.CORRUPTION=corruption;
        this.PRODUCTIVITY=productivity;
        this.SOCIETY=society;
        this.LAW=law;
        this.LORE=lore;
        this.CRIME=crime;
        this.SPELL_MODIFIER=sp;
        this.BASE_VALUE_MULTIPLIER=bvm;
        this.PURCHASE_MULTIPLIER=pm;
        this.DANGER_MODIFIER=danger;
        this.SPECIAL=((special==0)?false:true);
    }
}