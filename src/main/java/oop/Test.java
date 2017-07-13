package oop;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Paladin starix = new Paladin("Starix", 1000, 100);
        Paladin abadon = new Paladin("Abadon", 1500, 70);

        while (starix.isAlive() && abadon.isAlive()) {
            System.out.println(starix.getName() + " make an attack!");
            int starixDmg = starix.makeAttack();
            System.out.println(starix.getName() + " damage dealt: " + starixDmg + "\n");
            System.out.println(abadon.getName() + " health left: " + abadon.getHealth() + "\n");

            abadon.takeAttack(starixDmg);

            Thread.sleep(3000);

            System.out.println(abadon.getName() + " make an attack!");
            int abadonDmg = abadon.makeAttack();
            System.out.println(abadon.getName() + " damage dealt: " + abadonDmg + "\n");
            System.out.println(starix.getName() + " health left: " + starix.getHealth() + "\n");

            starix.takeAttack(abadonDmg);

            Thread.sleep(3000);
        }

        if (abadon.isAlive()) abadon.victoryVoice();
        if (starix.isAlive()) starix.victoryVoice();
    }
}
