package oop.battle.v4;

public abstract class Hero {

    protected String name;
    protected int health;
    protected int attack;

    public Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public abstract void attack(Hero hero);

    public boolean isAlive() {
        return this.health > 0;
    }

    protected void logAttack(Hero attacker, int dmg, Hero defender) {
        System.out.printf("%s make an attack! %s damage dealt: %d. %s health left: %d\n\n",
                attacker.name, attacker.name, dmg, defender.name, defender.health);
    }

    public void victoryVoice() {
        System.out.println(name + " is win! What a hero!");
    }

    public int rnd(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }

    public boolean isHadTheChance(int percent) {
        return rnd(1, 100) < percent;
    }
}
