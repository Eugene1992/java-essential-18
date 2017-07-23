package oop.battle.v5;

import java.util.List;

public class Player {

    private String name;
    private List<Hero> heroes;
    private boolean isAlive;

    public Player(String name, List<Hero> heroes) {
        this.name = name;
        this.heroes = heroes;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public boolean isAlive() {
        for (Hero hero : heroes) {
            if (hero.isAlive()) {
                return true;
            }
        }
        isAlive = false;
        return false;
    }

    public void congrats() {
        if (isAlive) {
            System.out.println(name + " is a winner! Congrats!");
        }
    }
}
