package oop.battle.v5;

import static oop.battle.v5.BattleUtils.isHadTheChance;

public class DarkElf extends Elf {

    private int criticalPercentChance = 30;

    public DarkElf(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attack(Hero hero) {
        int dmg = this.attack * BattleUtils.getRandomDamage(1, 4);
        if (isHadTheChance(criticalPercentChance)) {
            dmg *= 2;
            System.out.println("CRITICAL ATTACK!");
        }
        hero.health -= dmg;
        BattleUtils.logAttack(this, dmg, hero);
    }
}
