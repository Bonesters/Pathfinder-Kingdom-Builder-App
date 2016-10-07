package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 10/3/16.
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

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCorruption()
    {
        return corruption;
    }

    public void setCorruption(double corruption)
    {
        this.corruption = corruption;
    }

    public double getProductivity()
    {
        return productivity;
    }

    public void setProductivity(double productivity)
    {
        this.productivity = productivity;
    }

    public double getSociety()
    {
        return society;
    }

    public void setSociety(double society)
    {
        this.society = society;
    }

    public double getLaw()
    {
        return law;
    }

    public void setLaw(double law)
    {
        this.law = law;
    }

    public double getLore()
    {
        return lore;
    }

    public void setLore(double lore)
    {
        this.lore = lore;
    }

    public double getCrime()
    {
        return crime;
    }

    public void setCrime(double crime)
    {
        this.crime = crime;
    }

    public double getSpellMod()
    {
        return spellMod;
    }

    public void setSpellMod(double spellMod)
    {
        this.spellMod = spellMod;
    }

    public double getbValMul()
    {
        return bValMul;
    }

    public void setbValMul(double bValMul)
    {
        this.bValMul = bValMul;
    }

    public double getPurMul()
    {
        return purMul;
    }

    public void setPurMul(double purMul)
    {
        this.purMul = purMul;
    }

    public double getDanger()
    {
        return danger;
    }

    public void setDanger(double danger)
    {
        this.danger = danger;
    }

    public boolean isSpecial()
    {
        return special;
    }

    public void setSpecial(boolean special)
    {
        this.special=special;
        if(!special)
        {
            specialText="";
        }
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

    //TODO: add toString()
    @Override
    public String toString()
    {
        return "{"+id+","+name+","+corruption+","+productivity+","+society+","+law+","+lore+","+crime+","+spellMod+","+bValMul+","+purMul+","+danger+","+special+","+specialText+"}";
    }
}
