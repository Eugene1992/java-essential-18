package oop.battle.v4;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Hero starix = new Elf("Starix", 1000, 140);
        Hero abadon = new Paladin("Abadon", 1500, 70);

        Hero dwarf = new Dwarf("Abadon", 1500, 70);

//        Hero hero = new Hero("Hero", 1000, 200);

        singleBattle(starix, abadon);
    }

    static void singleBattle(Hero first, Hero second) throws InterruptedException {
        while (first.isAlive() && second.isAlive()) {

            first.attack(second);

            if (!first.isAlive()) {
                second.victoryVoice();
                break;
            }
            Thread.sleep(1000);;

            second.attack(first);

            if (!second.isAlive()) {
                first.victoryVoice();
                break;
            }
            Thread.sleep(1000);
        }
    }

    /*static void groupBattle(Hero[] firstTeam, Hero[] secondTeam) {
        for (int i = 0; i < firstTeam.length; i++) {
            firstTeam[i].attack(secondTeam[])
            secondTeam[i].attack(firstTeam[])
        }
    }

    static void groupBattle(Player first, Player second) {
        while (first.isAlive() && second.isAlive()) {

        }
    }*/
}
