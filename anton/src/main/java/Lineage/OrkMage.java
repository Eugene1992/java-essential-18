package Lineage;

public class OrkMage extends Ork {
    public OrkMage(String name, int hp, int mp, int pDmg, int mDmg, int pDef, int mDef) {
        super(name, hp, mp, pDmg, mDmg, pDef, mDef);
    }

    @Override
    public void attack(Heroes heroes) {
        int dmg = this.mDmg;
        hp -= dmg;
        logAttack(this, dmg, heroes);
    }
}
