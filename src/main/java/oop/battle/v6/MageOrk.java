package oop.battle.v6;

import java.util.Scanner;

public class MageOrk extends Ork {

    public MageOrk(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attack(Hero hero) {

        Shot shot = null;

        if (BattleUtils.isHadTheChance(15)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose what magic shot to cast: ");
            System.out.println("1) Wartex\n2) CurseFear ");
            String shotType = scanner.next();

            switch (shotType) {

                case "Wartex":
                    shot = new FireWortexShot(100);
                    break;

                case "CurseFear":
                    shot = new CurseFear(50);
                    break;
            }
        } else {
            shot = new BasicShot();
        }
        int dmg = shot.calcDamage();
        hero.health -= dmg;
    }

    public class FireWortexShot extends MagicShot {

        public FireWortexShot(int manaCost) {
            super(manaCost);
        }

        @Override
        public int calcDamage() {
            System.out.println(attack);
            return 0;
        }
    }

    public class CurseFear extends MagicShot {

        public CurseFear(int manaCost) {
            super(manaCost);
        }

        @Override
        public int calcDamage() {
            return 0;
        }
    }
}
