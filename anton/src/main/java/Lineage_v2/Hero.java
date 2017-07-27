package Lineage_v2;

public abstract class Hero {
    String name;
    protected int hp;
    protected int mp;
    protected int pDef;
    protected int mDef;
    protected int pDmg;
    protected int mDmg;

    public Hero(String name, int hp, int mp, int pDef, int mDef, int pDmg, int mDmg) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.pDef = pDef;
        this.mDef = mDef;
        this.pDmg = pDmg;
        this.mDmg = mDmg;
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

    public int getpDmg() {
        return pDmg;
    }

    public void setpDmg() {
        this.pDmg = pDmg;
    }

    public int getmDmg() {
        return mDmg;
    }

    public abstract void attack(Hero hero);

    public boolean isAlive(){
        return this.hp > 0;
    }
    public boolean isHadMana(){
        return this.mp > 0;
    }
    public void logAttack(Hero attacker, int dmg, Hero defender){
        System.out.printf("%s attacked %s and damaged him: %d, %s left: %d hp \n\n", attacker.name, defender.name, dmg, defender.name, defender.hp );
    }
    public void victoryVoice(){
        System.out.println(this.name + " is the best hero ever!");
    }

}
