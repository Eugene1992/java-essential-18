package oop.battle.v2;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Hero starix = new Elf("Starix", 1000, 100);
        Hero abadon = new Paladin("Abadon", 1500, 70);

        while (starix.isAlive() && abadon.isAlive()) {

            starix.attack(abadon);
            Thread.sleep(1000);

            abadon.attack(starix);
            Thread.sleep(1000);
        }

        if (!abadon.isAlive()) {
            starix.victoryVoice();
        }

        if (!starix.isAlive()) {
            abadon.victoryVoice();
        }
    }
}
