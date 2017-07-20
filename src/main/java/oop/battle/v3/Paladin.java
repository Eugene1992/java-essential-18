package oop.battle.v3;

public class Paladin extends Hero {

    private int healthPercentChance = 30;

    public Paladin(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attack(Hero hero) {
        int dmg = this.attack * rnd(1, 4);
        if (isHadTheChance(healthPercentChance)) {
            health *= 1.33;
            System.out.println("HEALTH!");
        }
        hero.health -= dmg;
        super.logAttack(this, dmg, hero);
    }
}
