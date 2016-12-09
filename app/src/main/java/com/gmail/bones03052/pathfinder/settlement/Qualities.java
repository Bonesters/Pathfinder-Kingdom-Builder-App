package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 9/2/16.
 */
public enum Qualities
{
    ABUNDANT(0,1,0,0,0,0,0,0,0,0,true,"Reduce the purchase price of most forms of locally-grown food and livestock by 25% or more."),
    ABSTINENT(2,0,-2,1,0,0,0,0,0,0,false,""),
    ACADEMIC(0,0,0,0,1,0,1,0,0,0,false,""),
    ANIMAL_POLYGLOT(0,-1,0,0,1,0,1,0,0,0,true,"Similar to the Magical Polyglot effect, a magical aura hangs over the settlement. All creatures of the Animal type gain the ability to speak and think while within the settlement's borders. Animals act as if their INT scores were 6, and gain ability to speak Common; they lose these benefits as soon as they pass the settlement's borders. There are likely to be few butcher shops within the settlement's borders…. Add the settlement's Lore modifier to Handle Animal checks made within the settlement."),
    ARTISTS_COLONY(0,1,1,0,0,0,0,0,0,0,true,"Add the settlement's Economy modifier on all Craft checks, not just those made to earn a living."),
    ASYLUM(0,0,-2,0,1,0,0,0,0,0,false,""),
    CITY_OF_THE_DEAD(0,-2,0,1,2,0,0,0,0,0,true,"Add the settlement's Lore modifier to Knowledge (history) and Knowledge (nobility) checks."),
    CRUEL_WATCH(1,0,-2,2,0,-3,0,0,0,0,false,""),
    DECADENT(1,1,1,0,0,1,0,0.25,0,10,false,""),
    DEFENSIBLE(1,2,-1,0,0,1,0,0,0,0,false,""),
    DESECRATE(0,0,0,0,0,0,0,0,0,0,true,"Special Restriction Good or Evil communities only. The entire settlement is under the effects of a permanent desecrate or hallow effect (choose only one) of incredible power. This effect can be suppressed in small areas within the settlement. The caster level for the effect is equal to 20 + the settlement's size modifier, for the purpose of dispelling."),
    HALLOW(0,0,0,0,0,0,0,0,0,0,true,"Special Restriction Good or Evil communities only. The entire settlement is under the effects of a permanent desecrate or hallow effect (choose only one) of incredible power. This effect can be suppressed in small areas within the settlement. The caster level for the effect is equal to 20 + the settlement's size modifier, for the purpose of dispelling."),
    ELDRITCH(0,0,0,0,0,0,0,0,0,13,true,"Increase spellcasting by +2 levels when casting divination or necromancy spells only."),
    FAMED_BREEDERS(0,1,0,0,0,0,0,0,0,0,true,"Increase Base Value and Base Purchase Limit by +20% when dealing with mounts and associated gear. Characters can purchase mounts or live stock in the settlement at a +10% discount."),
    FINANCIAL_CENTER(0,2,0,1,0,0,0,0.4,0.4,0,true,"Special Restriction Non-chaotic communities only."),
    FREE_CITY(0,0,0,-2,0,2,0,0,0,5,true,"Special Restriction Chaotic communities only."),
    GAMBLING(2,2,0,-1,0,2,0,0,0.1,0,false,""),
    GOD_RULED(-2,0,-2,0,0,0,0,0,0,0,true,"Special Requirement Theocracy or Utopian Experiment governments only. The settlement has no real government; instead it is ruled by religious codes and omens. Gods or other powerful spiritual beings or outsiders intervene directly in the settlement's politics and daily life. Ordinary citizens are possessed by spirits to speak decrees, unmistakable oracles appear as flaming messages written on walls or in the sky, or perhaps each and every citizen has prophetic dreams that tell them what they must do in the coming day for the settlement to thrive. "),
    GOOD_ROADS(0,2,0,0,0,0,0,0,0,0,false,""),
    GUILDS(1,1,0,0,-1,0,0,0,0,0,false,""),
    HOLY_SITE(-2,0,0,0,0,0,2,0,0,0,false,""),
    INSULAR(0,0,0,1,0,-1,0,0,0,0,false,""),
    //TODO: calculate special for legendary marketplace. shouldn't be too difficult.
    LEGENDARY_MARKETPLACE(0,2,0,0,0,2,0,0,0,0,true,"The settlement is justly famed for its markets: almost anything may be for sale here! The settlement's Base Value and Purchase Limits are treated as if the settlement was one size category larger. In the case of a Metropolis with the Legendary Marketplace quality, double the settlement's Base Value and Purchase Limit."),
    LIVING_FOREST(0,-4,2,0,1,-2,0,0,0,0,true,"Increase Spellcasting by 4 levels (druidic spells only)."),
    MAGICALLY_ATTUNED(0,0,0,0,0,0,2,0.2,0.2,0,false,""),
    MAGICAL_POLYGLOT(0,1,1,0,1,0,0,0,0,0,true,"The settlement is blessed with a magical aura that allows all sentient creatures within its borders to understand one another as if they shared a common language. This permanent magical effect is similar to the tongues spell, and has no effect on written language, only the words spoken by the settlement's inhabitants."),
    MAJESTIC(0,0,0,0,0,0,1,0,0,0,false,""),
    MOBILE_FRONTLINES(-1,-1,-1,0,0,0,0,0,0,0,true,"The entire settlement can move, albeit slowly, not much faster than an average man could walk. Perhaps it floats on a cushion of magical air, hundreds of feet above the landscape, is a fortress- castle growing from the back of some impossibly large creature, or is some kind of enormous steampunk or magi-tech tank. This city is designed to patrol its kingdom or territory, responding to threats and offering the city's defenses to those in need. Increase the Base Value and Purchase Limit of the settlement by 25% when trading weapons and armor."),
    MOBILE_SANCTUARY(0,1,-1,0,0,0,0,0,0,0,true,"This mobile settlement is designed to retreat from danger, moving to a safer location when threatened by natural disasters, invasion or famine threatens."),
    MORALLY_PERMISSIVE(1,1,0,0,0,0,0,0,0,0,true,"Divine indulgence or perhaps just a corrupt church selling indulgences has made this settlement famous (or infamous) for its lax morals. Select 1d4+1 acts that would normally be considered sinful or immoral; these acts are not crimes or sins within the settlement, and committing these acts does not violate a paladin or cleric's moral code, so long as the offense is limited to within the settlement's borders. Decrease divine spellcasting by -1 level."),
    NOTORIOUS(0,0,0,-1,0,1,0,0.3,0.5,10,false,""),
    PEACEBONDING(0,0,0,1,0,-1,0,0,0,0,true,"By local law, any weapon larger than a dagger and all wands and rods must either be peacebound or stored at the local sherrif's office or jail (at the settlement's option) for the duration of the visit. Peacebonding a weapon involves winding a colored cord tightly around the weapon and its scabbard, and then impressing the local seal in wax. Removing the peacebond requires a full round action before the item can be drawn. (Disable Device DC 12 to untangle the bond as a move equivalent action; bond hp 5, no hardness)"),
    PHANTASMAL(0,-2,-2,0,0,0,0,0,0,0,true,"The settlement simply isn't always there! This magical settlement might only appear in the moonlight, appear out of the mist on particularly holy or infamous dates, or only appear in this plane during thunderstorms or on particularly hot days. At other times, the settlement simply doesn't exist on this plane; powerful, plane-crossing magic is required to access the settlement outside of the ‘proper' time. The highly magical settlement is insular and clannish as a result of its isolation from the outside world. Increase spellcasting by two levels when dealing with planar magic or conjuration (summoning or teleportation) spells only."),
    PIOUS(0,0,0,0,0,0,1,0,0,0,true,"The settlement is known for its inhabitants' good manners, friendly spirit, and deep devotion to a deity (this deity must be of the same alignment as the community). Increase spellcasting by 1 level; any faith more than one alignment step different than the community's official religion is at best unwelcome and at worst outlawed—obvious worshipers of an outlawed deity must pay 150% of the normal price for goods and services and may face mockery, insult, or even violence)"),
    PLANAR_CROSSROADS(0,2,0,0,0,3,2,0,0.25,20,true,"Natural or artificial planar gates near the settlement make it a cross-roads for planar travel. Creatures from across the multiverse, both malevolent and benign, can be found here, as can their artifacts. In addition, the Planar Crossroads settlement is the point of origin for many breed of monstrous player characters. Reduce the ECL of any monstrous player race if that race has its origin in this settlement, making heroic versions of these creatures more common in the region."),
    PLANNED_COMMUNITY(0,1,-1,0,0,-1,0,0,0,0,false,""),
    POCKET_UNIVERSE(0,-2,0,0,0,0,2,0,0,0,true,"Thanks to a magical fold in space and time, the settlement exists in a place far too small to sustain it. A sleepy hamlet might be found in an old mansion's disused pantry, a huge fortress might hide the space between two old oaks, or a planar metropolis might be contained within a single cramped alley of a much less important city-state. Depending on the nature of the settlement and its relationship with the outside world, the settlement might be impossible to find. It may skill checks to even find the entrance to the settlement: usually a DC 20 Knowledge (local) or Knowledge (the planes) check. The settlement's size modifier is applied to this check, albeit inverted. After all, it's easier to find a Metropolis (DC 16) than a Thorpe (DC 24)."),
    POPULATION_SURGE(0,0,2,0,0,1,0,0,0,0,false,""),
    PROSPEROUS(0,1,0,0,0,0,0,0.3,0.5,0,false,""),
    RACIALLY_INTOLERANT(0,0,0,0,0,0,0,0,0,0,true,"The community is prejudiced against one or more races, which are listed in parentheses. (Members of the unwelcome race or races must pay 150% of the normal price for goods and services and may face mockery, insult, or even violence)"),
    RACIAL_ENCLAVE(0,0,-1,0,0,0,0,0,0,0,true,"The settlement is dominated by a single race: a pleasant halfling farming community, an elven capitol, a collection of half-orc yurts on the open plains, ect. Members of one or more races, chosen when the settlement is founded, is especially welcome in the tight-knit and homogeneous settlement. Members of this race can purchase goods and services in the settlement at a 25% discount."),
    RESETTLED_RUINS(0,1,0,0,1,0,0,0,0,0,true,"The settlement is built amid the ruins of a more ancient structure. The settlement might be little more than a collection of tents and yurts erected in ruined plazas, or a thriving metropolis whose stones were recycled from long-forgotten temples and fortresses. While ruins provide a ready source of building materials, near-by dungeons to plunder and ancient artifacts to explore, they might also provide a hiding place for modern dangers or old curses. Add +1d3 to the amount of magic items in any category the settlement's size would allow it to normally offer. If the settlement's size would not normally allow it to have magic items of a particular category, it always has at least one randomly chosen item of that category for sale. However, if a buyer rolls a natural one on any Appraise or Diplomacy check made to examine or purchase a locally bought magic item, that item is always cursed."),
    RELIGIOUS_TOLERANCE(0,0,1,0,1,0,0,0,0,0,true,"The settlement is known for its widespread religious tolerance, and many faiths have temples, cathedrals or monasteries here. Religious debates in the public square are common. Increase divine spellcasting by +2 levels."),
    ROMANTIC(0,0,1,0,0,0,0,0,0,0,true,"The settlement's inhabitants are renowned for their stunning beauty and charm, and the location has been made famous in dozens of romantic songs, poems and bawdy limericks. Affairs of the heart are common here, among the town's hotblooded, lusty inhabitants. Double the amount of minor magic items available for sale in the marketplace. Such trinkets are a popular, if expensive, token of affection here."),
    ROYAL_ACCOMMODATIONS(0,1,-1,2,0,0,0,0,0,0,true,"One or more members of a royal dynasty call the settlement home. As such, security is extremely tight, and the local economy has taken flight, as merchants catering to the nobility have sprung up. Increase the Purchase Price of high quality or luxury items, such as jewelry, fine clothes or food, entertainment, weapons and all magical items purchased in the settlement by +10% due to widespread inflation."),
    RUMORMONGERING_CITIZENS(0,0,-1,0,1,0,0,0,0,0,false,""),
    RURAL(0,-1,0,0,0,-1,0,0,0,-5,false,""),
    SACRED_ANIMALS(-1,-1,0,0,1,0,0,0,0,0,true,"In this settlement there is a great taboo (punishable by death, exile or other severe penance) about killing a particular breed of beast. Depending on the settlement, the sacred animal might be innocuous (house cats, ravens), irritating and mischievous (monkeys) or a stubborn hazard on the roads (horses, cattle). The animals have free run of the settlement."),
    SEXIST(0,0,-2,0,0,0,0,0,0,0,true,"The settlement's laws have completely disenfranchised one gender or the other: the oppressed sex has no more legal rights than a pet or a slave, and cannot buy property. While within the settlement, members of the oppressed gender cannot legally make purchases of items worth more than 5 gp, and are usually ignored by the settlement's inhabitants, and may suffer mockery, violence or legal persecution."),
    SLUMBERING_MONSTER(0,0,1,0,2,0,2,0,0,0,true,"The settlement is home to some form of powerful and ancient monster- a slumbering behemoth, a dark god imprisoned by magical means, an ancient war-robot kept in stasis, or some other, currently inert threat. The inhabitants of the settlement expend vast effort keeping their monstrous prisoner contained, and by doing so, they have developed an impressive mastery of arcana. At the Gamemasters discretion, the slumbering monster might be awakened. Doing so removes this quality, and afflicts the settlement with the Hunted disadvantage instead. The slumbering monster must either be destroyed or re-imprisoned by PC actions to restore this quality to the settlement."),
    SMALL_FOLK_SETTLEMENT(0,0,0,1,1,0,0,0,0,0,true,"This settlement is designed for the comfort of a mostly gnome or halfling population. Its doors and ceilings are built for the comfort of the smaller races, and can be absolute murder on the foreheads of taller humanoids. Everything in the settlement, from furniture to forks, is sized for small creatures. Medium-sized and larger creatures treat the Settlement's Crime and Society statistics as a penalty due to their difficulty in maneuvering or sneaking around in the miniature Settlement. Small or smaller creatures treat the Settlement's Crime and Society statistics normally."),
    STRATEGIC_LOCATION(0,1,0,0,0,0,0,0.1,0,0,false,""),
    SUPERSTITIOUS(0,0,2,2,0,-4,-2,0,0,0,false,""),
    THERAPEUTIC(0,1,0,0,1,0,0,0,0,0,true,"The settlement is known for its minor healing properties- medicinal hot springs, clean, invigorating mountain air, a plethora of locally grown healing herbs and fruits, or perhaps some divine blessing. Whatever the reason, hospitals, nurseries, retreats and sanitariums are common within the settlement. Heal checks made within the settlement's borders also receive the settlement's Lore modifier if positive."),
    TRADING_POST(0,0,0,0,0,0,0,0,1,0,false,""),
    TOURIST_ATTRACTION(0,1,0,0,0,0,0,0.2,0,0,false,""),
    UNAGING(0,0,-3,0,4,0,0,0,0,0,true,"The settlement's magical aura prevents those within its borders from aging. They do not suffer the ravages of time, and do not physically age. Usually, several kibbutz or schools near the settlement, but not within its borders are established, to allow the community's children to age to adulthood before they take their unchanging place in the settlement's immortal society. Increase spellcasting by +1 level, when casting spells of the necromancy school only."),
    UNDERCITY(0,0,0,0,1,0,0,0,0,20,false,""),
    UNHOLY_SITE(2,0,0,0,0,0,2,0,0,0,false,""),
    UNTAMED(0,0,0,0,0,0,0,0,0,0,true,"The area around the settlement is still mostly untainted, unclaimed wilderness. This settlement may be a remote logging village, a trading post sprung up around a desert oasis or a small mountain keep, for instance. When rolling for random encounters within the settlement, instead of using an urban random encounter chart solely, alternate between the urban encounter chart and the wilderness encounter chart (or chart) most appropriate to the surrounding terrain. The settlement's Danger rating applies to both encounter charts."),
    WELL_EDUCATED(0,0,1,0,1,0,0,0,0,0,false,"");


    //TODO: add disadvantages.



    public static final int MAX_LENGTH=2000;


    public final int CORRUPTION;
    public final int PRODUCTIVITY;
    public final int SOCIETY;
    public final int LAW;
    public final int LORE;
    public final int CRIME;
    public final int SPELL_MODIFIER;
    public final double BASE_VALUE_MULTIPLIER;
    public final double PURCHASE_MULTIPLIER;
    public final int DANGER_MODIFIER;
    public final boolean SPECIAL;
    public final String SPECIAL_TEXT;

    Qualities(int corruption,int productivity,int society,int law,int lore,int crime,int sp,double bvm,double pm,int danger,boolean special,String specialText)
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
        this.SPECIAL=special;
        this.SPECIAL_TEXT=specialText;
    }

    @Override
    public String toString()
    {
        return (new Quality(this)).toString();
    }
}