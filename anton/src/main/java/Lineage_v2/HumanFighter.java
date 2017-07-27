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
            if (skillChoosing.equals("1")) {
                dmg *= 1.2;
                hp -= dmg;
                this.mp -= 150;
            }
            if (skillChoosing.equals("2")) {
                dmg *= 2.4;
                hp -= dmg;
                this.mp -= 220;
            }
            if (skillChoosing.equals("3")) {
                dmg *= 0.8;
                hp -= dmg;
                this.mp -= 65;
            }
        }
        logAttack(this, dmg, hero);
    }
}
