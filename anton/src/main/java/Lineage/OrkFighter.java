package Lineage;

public class OrkFighter extends Ork {
    public OrkFighter(String name, int hp, int mp, int pDmg, int mDmg, int pDef, int mDef) {
        super(name, hp, mp, pDmg, mDmg, pDef, mDef);
    }

    @Override
    public void attack(Heroes heroes) {
        int dmg = this.pDmg;
        hp -= dmg;
        logAttack(this, dmg, heroes);
    }
}
