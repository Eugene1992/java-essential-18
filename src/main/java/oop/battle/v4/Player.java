package oop.battle.v4;

public class Player {
    private String name;
    private Hero[] heroes;

    public boolean isAlive() {
        for (Hero hero : heroes) {
            if (hero.isAlive()) return true;
        }
        return false;
    }
}
