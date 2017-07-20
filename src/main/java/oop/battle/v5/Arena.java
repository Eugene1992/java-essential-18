package oop.battle.v5;

import static oop.battle.v5.BattleUtils.getRandomArrayIndex;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Hero starix = new DarkElf("Starix", 2500, 120);
        Hero dwarf = new Dwarf("Ded Maksim", 1500, 80);

        Hero abadon = new Paladin("Abadon", 1000, 50);
        Hero zoolus = new Paladin("Zoolus", 3000, 150);


        Player anton = new Player("Anton", starix, dwarf);
        Player dima = new Player("Dima", abadon, zoolus);

        groupBattle(anton, dima);
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

    static void groupBattle(Player first, Player second) throws InterruptedException {
        if (first.getHeroes().length != second.getHeroes().length) {
            System.out.println("Teams are had not equals length");
            return;
        }
        while (first.isAlive() && second.isAlive()) {
            Hero[] firstHeroes = first.getHeroes();
            Hero[] secondHeroes = second.getHeroes();

            for (int i = 0; i < firstHeroes.length; i++) {
                int rndIndex = getRandomArrayIndex(secondHeroes);
                firstHeroes[i].attack(secondHeroes[rndIndex]);
                Thread.sleep(1000);

                rndIndex = getRandomArrayIndex(firstHeroes);
                secondHeroes[i].attack(firstHeroes[rndIndex]);
                Thread.sleep(1000);
            }
        }

        first.congrats();
        second.congrats();
    }
}
