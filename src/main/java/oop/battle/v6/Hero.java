package oop.battle.v6;

public abstract class Hero {

    protected String name;
    protected int health;
    protected int attack;

    public Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    protected abstract class Shot {

        public abstract int calcDamage();
    }

    protected abstract class MagicShot extends Shot {

        protected int manaCost;

        public MagicShot(int manaCost) {
            this.manaCost = manaCost;
        }
    }

    protected class BasicShot extends Shot {

        @Override
        public int calcDamage() {
            return attack;
        }
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

    public void victoryVoice() {
        System.out.println(name + " is win! What a hero!");
    }

}
