package oop.battle.v4;

public class Elf extends Hero {

    private int criticalPercentChance = 30;

    public Elf(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attack(Hero hero) {
        int dmg = this.attack * rnd(1, 4);
        if (isHadTheChance(criticalPercentChance)) {
            dmg *= 2;
            System.out.println("CRITICAL ATTACK!");
        }
        hero.health -= dmg;
        super.logAttack(this, dmg, hero);
    }
}
