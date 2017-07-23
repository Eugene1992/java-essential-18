package oop.battle.v5;

import java.util.ArrayList;
import java.util.List;

import static oop.battle.v5.BattleUtils.getRandomArrayIndex;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Hero starix = new DarkElf("Starix", 2500, 120);
        Hero dwarf = new Dwarf("Ded Maksim", 1500, 80);
        List<Hero> firstTeam = new ArrayList<>();
        firstTeam.add(starix);
        firstTeam.add(dwarf);

        Hero abadon = new Paladin("Abadon", 1000, 50);
        Hero zoolus = new Paladin("Zoolus", 3000, 150);
        List<Hero> secondTeam = new ArrayList<>();
        secondTeam.add(abadon);
        secondTeam.add(zoolus);


        Player anton = new Player("Anton", firstTeam);
        Player dima = new Player("Dima", secondTeam);

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
        if (first.getHeroes().size() != second.getHeroes().size()) {
            System.out.println("Teams are had not equals length");
            return;
        }
        while (first.isAlive() && second.isAlive()) {
            List<Hero> firstHeroes = first.getHeroes();
            List<Hero> secondHeroes = second.getHeroes();

            for (int i = 0; i < firstHeroes.size(); i++) {

                int rndIndex = getRandomArrayIndex(secondHeroes);

                Hero def = secondHeroes.get(rndIndex);

                if (!def.isAlive()) {
                    secondHeroes.remove(rndIndex);
                }

//                firstHeroes.get(i).attack();
                Thread.sleep(1000);

                rndIndex = getRandomArrayIndex(firstHeroes);
                secondHeroes.get(i).attack(firstHeroes.get(rndIndex));
                Thread.sleep(1000);
            }
        }

        first.congrats();
        second.congrats();
    }
}
