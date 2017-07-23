package Lineage;

/**
 * MAIN CLASS
 **/
public abstract class Heroes {
    protected String name;
    protected int hp;
    protected int mp;
    protected int pDmg;
    protected int mDmg;
    protected int pDef;
    protected int mDef;

    public Heroes(String name, int hp, int mp, int pDmg, int mDmg, int pDef, int mDef) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.pDmg = pDmg;
        this.mDmg = mDmg;
        this.pDef = pDef;
        this.mDef = mDef;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp() {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp() {
        this.mp = mp;
    }

    public int getpDmg() {
        return pDmg;
    }

    public void setpDmg() {
        this.pDmg = pDmg;
    }

    public int getmDmg() {
        return mDmg;
    }

    public void setmDmg() {
        this.mDmg = mDmg;
    }

    public int getpDef() {
        return pDef;
    }

    public void setpDef() {
        this.pDef = pDef;
    }

    public int getmDef() {
        return mDef;
    }

    public void setmDef() {
        this.mDef = mDef;
    }

    public abstract void attack(Heroes heroes);

    protected void logAttack(Heroes attacker, int dmg, Heroes defender) {
        System.out.printf("%s attacked %s, and damaged him: %d! %s left: %d hp \n\n",
                attacker.name, defender.name, dmg, defender.name, defender.hp);
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public boolean isHadTheMana() {
        manaEnds();
        return this.mp > 0;
    }

    public void victoryVoice() {
        System.out.println(this.name + " is the WINNER!");
    }

    public boolean manaEnds() {
        if (this.mp < 0) {

        }
        return false;
    }
}
