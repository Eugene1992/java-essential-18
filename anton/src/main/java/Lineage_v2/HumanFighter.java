package Lineage_v2;

import java.util.Scanner;

public class HumanFighter extends Human {
    private int mortalBlow = 25; //mana cost 150
    private int lethalBlow = 25; //mana cost 220
    private int backStab = 25; // mana cost 65

    public HumanFighter(String name, int hp, int mp, int pDef, int mDef, int pDmg, int mDmg) {
        super(name, hp, mp, pDef, mDef, pDmg, mDmg);
    }

    @Override
    public void attack(Hero hero) {
        int dmg = this.pDmg;
        hp -= dmg;

        if (BattleUtils.isHadTheChance(25)) {
            System.out.println("Choose the skill: ");
            System.out.println("1: Mortal Blow;");
            System.out.println("2: lethalBlow;");
            System.out.println("3: backStab;");
            Scanner skill = new Scanner(System.in);
            String skillChoosing = skill.next();
            Shot shot = null;
            if (skillChoosing.equals("1")) {
                shot = new Shot(1.2, 150);
            }
            if (skillChoosing.equals("2")) {
                shot = new Shot(2.4, 220);
            }
            if (skillChoosing.equals("3")) {
                shot = new Shot(0.8, 65);
            }
            dmg += shot.executeFor(hero);
        }
        logAttack(this, dmg, hero);
    }

    private class Shot {
        double dmgScale;
        int mpCost;

        public Shot(double dmgScale, int mpCost) {
            this.dmgScale = dmgScale;
            this.mpCost = mpCost;
        }

        public double executeFor(Hero defender) {
            double dmg = dmgScale * HumanFighter.this.pDmg;
            defender.hp -= dmg;
            HumanFighter.this.mp -= mpCost;
            return dmg;
        }
    }
}
