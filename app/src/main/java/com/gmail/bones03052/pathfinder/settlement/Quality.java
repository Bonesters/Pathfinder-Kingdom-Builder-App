package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by root on 10/3/16.
 */

public class Quality
{
    private int id;
    private String name;
    private double corruption;
    private double productivity;
    private double society;
    private double law;
    private double lore;
    private double crime;
    private double spellMod;
    private double bValMul;
    private double purMul;
    private double danger;
    private boolean special;
    private String specialText;

    public Quality(int id,String name,double corruption,double productivity,double society,double law,double lore,double crime,double spellMod,double bValMul,double purMul,double danger,boolean special,String specialText)
    {
        this.id=id;
        this.name=name;
        this.corruption=corruption;
        this.productivity=productivity;
        this.society=society;
        this.law=law;
        this.lore=lore;
        this.crime=crime;
        this.spellMod=spellMod;
        this.bValMul=bValMul;
        this.purMul=purMul;
        this.danger=danger;
        this.special=special;
        this.specialText=specialText;
    }

    public Quality(Qualities q)
    {
        this(q.ordinal(),q.name().toLowerCase(),q.CORRUPTION,q.PRODUCTIVITY,q.SOCIETY,q.LAW,q.LORE,q.CRIME,q.SPELL_MODIFIER,q.BASE_VALUE_MULTIPLIER,q.PURCHASE_MULTIPLIER,q.DANGER_MODIFIER,q.SPECIAL,q.SPECIAL_TEXT);
    }
}
