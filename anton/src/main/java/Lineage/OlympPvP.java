package Lineage;

public class OlympPvP {
    public static void main(String[] args) throws InterruptedException {
        Human alter = new HumanFighter("Alter", 1500, 500, 150, 100, 120, 80);
        Human vigo = new HumanMage("Vigo", 1300, 800, 100, 140, 60, 110);

        singleBattlle(alter, vigo);
    }

    static void singleBattlle(Heroes first, Heroes second) throws InterruptedException {
        while (first.isAlive() && second.isAlive()) {
            first.attack(second);
            Thread.sleep(1000);
            if (!first.isAlive()) {
                second.victoryVoice();
            }
            second.attack(first);
            Thread.sleep(1000);
            if (!second.isAlive()) {
                first.victoryVoice();
            }
        }
    }
}
