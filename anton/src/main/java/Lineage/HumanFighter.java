package Lineage;

public class HumanFighter extends Human {
    private int backsteb = 4; //mana cost 65;
    private int mortalBlow = 11;//mana cost 40;
    private int deathlyBlow = 23;//mana cost 100;
    private int LethalBlow = 18;//mana cost 180;

    public HumanFighter(String name, int hp, int mp, int pDmg, int mDmg, int pDef, int mDef) {
        super(name, hp, mp, pDmg, mDmg, pDef, mDef);
    }

    @Override
    public void attack(Heroes heroes) {
        int dmg = this.pDmg;
        if (BattlleUtils.isHadTheChance(backsteb)) {
            dmg *= 0.8;
            this.mp -= 65;
            System.out.println(this.name + " Cast: BACKSTEB! " + this.name + " Left " + this.mp + " mana");
            isHadTheMana();
        }
        if (BattlleUtils.isHadTheChance(mortalBlow)) {
            dmg *= 1.2;
            this.mp -= 40;
            System.out.println(this.name + " Cast: MORTAL BLOW! " + this.name + " Left " + this.mp + " mana");
            isHadTheMana();
        }
        if (BattlleUtils.isHadTheChance(deathlyBlow)) {
            dmg *= 1.7;
            this.mp -= 100;
            System.out.println(this.name + " Cast: DEATHLY BLOW! " + this.name + " Left " + this.mp + " mana");
            isHadTheMana();
        }
        if (BattlleUtils.isHadTheChance(LethalBlow)) {
            dmg *= 2.4;
            this.mp -= 180;
            System.out.println(this.name + " Cast: LETHAL BLOW " + this.name + " Left " + this.mp + " mana");
            isHadTheMana();
        }
        heroes.hp -= dmg;
        logAttack(this, dmg, heroes);
    }


}


