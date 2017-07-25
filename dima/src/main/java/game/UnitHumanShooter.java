package game;

public class UnitHumanShooter extends Hero {

    private static final int CRITICAL_ATTACK_CHANCE = 5;
    private static final int CRITICAL_DAMAGE_SCALE = 10;

    public UnitHumanShooter(String name, int hp, int armor, int minStrength, int maxStrength, int weponsDmg) {
        super(name, hp, armor, minStrength, maxStrength, weponsDmg);
    }

    @Override
    public void attackDmg(Hero hero) {
        int dmg = this.weaponsDmg;
        if (BattleUnits.isChanced(CRITICAL_ATTACK_CHANCE)){
            dmg = this.weaponsDmg * CRITICAL_DAMAGE_SCALE;
        }
        hero.hp -= dmg;
        BattleUnits.logAttack(this, dmg, hero);
    }
}

