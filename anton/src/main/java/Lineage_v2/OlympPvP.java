package Lineage_v2;

public class OlympPvP {

    public static void main(String[] args) throws InterruptedException {
        Human lotar = new HumanFighter("Lotar", 1600, 500, 79, 56, 160, 0);
        Human saruman = new HumanMage("Saruman", 1600, 700, 54, 82, 0, 150);
        while (lotar.isAlive() && saruman.isAlive()){
            lotar.attack(saruman);
            Thread.sleep(500);
            if (!saruman. isAlive()){
                lotar.victoryVoice();
            }
            saruman.attack(lotar);
            Thread.sleep(500);
            if (!lotar.isAlive()){
                saruman.victoryVoice();
            }
        }
    }
}
