package oop.battle.v3;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Elf starix = new Elf("Starix", 1000, 140);
        Paladin abadon = new Paladin("Abadon", 1500, 70);

        Dwarf dwarf = new Dwarf("Abadon", 1500, 70);

        singleBattle(starix, abadon);
    }

    static void singleBattle(Hero first, Hero second) throws InterruptedException {
        while (first.isAlive() && second.isAlive()) {

            first.attack(second);

            if (!first.isAlive()) {
                second.victoryVoice();
                break;
            }
            Thread.sleep(1000);

            second.attack(first);

            if (!second.isAlive()) {
                first.victoryVoice();
                break;
            }
            Thread.sleep(1000);
        }
    }

    static void singleBattle2(Hero first, Hero second) throws InterruptedException {

        if (first instanceof Dwarf) {
            Dwarf dwarf = (Dwarf) first;
            dwarf.attack(second);
        }

        if (first instanceof Elf) {
            Elf elf = (Elf) first;
            elf.attack(second);
        }

//      ...
    }
}
