package oop.battle.v5;

public class Player {

    private String name;
    private Hero[] heroes;
    private boolean isAlive;

    public Player(String name, Hero... heroes) {
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

    public Hero[] getHeroes() {
        return heroes;
    }

    public void setHeroes(Hero[] heroes) {
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
