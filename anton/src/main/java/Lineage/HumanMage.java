package Lineage;

public class HumanMage extends Human {
    private int prominence = 5; //mana cost 130
    private int blazingCircle = 17;//mana cost 110
    private int fireVortex = 37;//mana cost 200

    public HumanMage(String name, int hp, int mp, int pDmg, int mDmg, int pDef, int mDef) {
        super(name, hp, mp, pDmg, mDmg, pDef, mDef);
    }

    @Override
    public void attack(Heroes heroes) {
        int dmg = this.mDmg;
        if (BattlleUtils.isHadTheChance(prominence)) {
            dmg *= 1.1;
            this.mp -= 130;
            System.out.println(this.name + " Cast: PROMINENCE! " + this.name + " Left " + this.mp + " mana");
        }
        if (BattlleUtils.isHadTheChance(blazingCircle)){
            dmg *= 1.4;
            this.mp -= 110;
            System.out.println(this.name +" Cast: BLAZING CIRCLE! " + this.name + " Left " + this.mp + " mana");
        }
        if (BattlleUtils.isHadTheChance(fireVortex)) {
            dmg *= 2.5;
            this.mp -= 200;
            System.out.println(this.name + " Cast: FIRE VORTEX; " + this.name + " Left " + this.mp + " mana");
        }
        heroes.hp -= dmg;
        logAttack(this, dmg, heroes);
    }
}
