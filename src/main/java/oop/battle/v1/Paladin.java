package oop.battle.v1;

public class Paladin {

    private String name;
    private int health;
    private int attack;

    public Paladin(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    -------------------------------

    public void takeAttack(int dmg) {
        this.health -= dmg;
    }

    public int makeAttack() {
        return attack * rnd(1, 3);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void victoryVoice() {
        System.out.println(name + " is win! What a hero!");
    }

    public int rnd(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }
}
