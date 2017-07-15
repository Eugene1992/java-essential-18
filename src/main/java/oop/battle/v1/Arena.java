package oop.battle.v1;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Paladin starix = new Paladin("Starix", 1000, 100);
        Paladin abadon = new Paladin("Abadon", 1500, 70);

        String starixName = starix.getName();
        String abadonName = abadon.getName();

        while (starix.isAlive() && abadon.isAlive()) {
            int starixDmg = starix.makeAttack();

            System.out.printf("%s make an attack! %s damage dealt: %d. %s health left: %d\n\n",
                    starixName, starixName, starixDmg, abadonName, abadon.getHealth());

            abadon.takeAttack(starixDmg);

            if (!abadon.isAlive()) {
                starix.victoryVoice();
                break;
            }

            Thread.sleep(1000);

            int abadonDmg = abadon.makeAttack();

            System.out.printf("%s make an attack! %s damage dealt: %d. %s health left: %d\n\n",
                    abadonName, abadonName, abadonDmg, starixName, starix.getHealth());

            starix.takeAttack(abadonDmg);

            if (!starix.isAlive()) {
                abadon.victoryVoice();
                break;
            }

            Thread.sleep(1000);
        }
    }
}
