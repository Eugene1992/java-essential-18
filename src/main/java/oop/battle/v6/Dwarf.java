package oop.battle.v6;

import static oop.battle.v5.BattleUtils.isHadTheChance;

public class Dwarf extends Hero {

    private int blockPercentChance = 30;

    public Dwarf(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attack(Hero hero) {
        if (isHadTheChance(blockPercentChance)) {
            int dmg = this.attack * BattleUtils.getRandomDamage(1, 4);
            hero.health -= dmg;
            BattleUtils.logAttack(this, dmg, hero);
        } else {
            System.out.println("ATTACK BLOCKED!");
        }
    }
}
