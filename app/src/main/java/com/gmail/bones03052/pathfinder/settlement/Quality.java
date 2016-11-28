package com.gmail.bones03052.pathfinder.settlement;

/**
 * Created by Dennis Champagne on 10/3/16.
 */

public class Quality
{
    private int id;
    private String name;
    private int corruption;
    private int productivity;
    private int society;
    private int law;
    private int lore;
    private int crime;
    private int spellMod;
    private double bValMul;
    private double purMul;
    private int danger;
    private boolean special;
    private String specialText;

    /**
     * only use for deleting Building from the database.
     */
    public Quality(String name)
    {
        this(-1,name,0,0,0,0,0,0,0,0,0,0,false,"");
    }

    public Quality(int id,String name,int corruption,int productivity,int society,int law,int lore,int crime,int spellMod,double bValMul,double purMul,int danger,boolean special,String specialText)
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

    public int getCorruption()
    {
        return corruption;
    }

    public void setCorruption(int corruption)
    {
        this.corruption = corruption;
    }

    public int getProductivity()
    {
        return productivity;
    }

    public void setProductivity(int productivity)
    {
        this.productivity = productivity;
    }

    public int getSociety()
    {
        return society;
    }

    public void setSociety(int society)
    {
        this.society = society;
    }

    public int getLaw()
    {
        return law;
    }

    public void setLaw(int law)
    {
        this.law = law;
    }

    public int getLore()
    {
        return lore;
    }

    public void setLore(int lore)
    {
        this.lore = lore;
    }

    public int getCrime()
    {
        return crime;
    }

    public void setCrime(int crime)
    {
        this.crime = crime;
    }

    public int getSpellMod()
    {
        return spellMod;
    }

    public void setSpellMod(int spellMod)
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

    public int getDanger()
    {
        return danger;
    }

    public void setDanger(int danger)
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

    @Override
    public String toString()
    {
        return "{"+id+","+name+","+corruption+","+productivity+","+society+","+law+","+lore+","+crime+","+spellMod+","+bValMul+","+purMul+","+danger+","+special+","+specialText+"}";
    }
}
