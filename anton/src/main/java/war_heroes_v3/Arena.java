package war_heroes_v3;
// TODO: 18.07.2017 UNFINISHED 

import war_heroes_v2.Hero;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Heroe artas = new Paladin("Artas", 1700, 160);
        Heroe uter = new Dwarf("Uter", 1500, 140);
        Heroe kzatar = new Ork("Kzatar", 1600, 150);
        Heroe baltazar = new Elf("Baltazar", 1550, 138);

        while (artas.isAlive() || uter.isAlive()) {

            artas.attack(uter);
            Thread.sleep(500);

            uter.attack(artas);
            Thread.sleep(500);

            if (!artas.isAlive()) {
                uter.victoryVoice();
            }
            if (!uter.isAlive()) {
                artas.victoryVoice();
            }

        }


    }


}
