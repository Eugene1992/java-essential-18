package game;


public class UnitElfDark extends Hero {
    public UnitElfDark(String name, int hp, int armor, int minStrength, int maxStrength, int weaponsDmg) {
        super(name, hp, armor, minStrength, maxStrength, weaponsDmg);
    }

    @Override
    public void attackDmg(Hero hero) {
        int dmg = this.weaponsDmg + BattleUnits.getRndStrength(1, 10);
        hero.hp -= dmg;
        BattleUnits.logAttack(this, dmg, hero);
    }
}
