package oop.battle.v2;

public class Dwarf {

    private String name;
    private int health;
    private int attack;

    public Dwarf(String name, int health, int attack) {
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

}
