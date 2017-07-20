package oop.battle.v3;

public class Dwarf extends Hero {

    private int blockPercentChance = 30;

    public Dwarf(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attack(Hero hero) {
        if (isHadTheChance(blockPercentChance)) {
            int dmg = this.attack * rnd(1, 4);
            hero.health -= dmg;
            logAttack(this, dmg, hero);
        } else {
            System.out.println("ATTACK BLOCKED!");
        }
    }

    public void specialDwarfMethod() {}
}
