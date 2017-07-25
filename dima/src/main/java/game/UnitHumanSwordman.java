package game;


public class UnitHumanSwordman extends Hero {

    public UnitHumanSwordman(String name, int hp, int armor, int minStrength, int maxStrength, int weponsDmg) {
        super(name, hp, armor, minStrength, maxStrength, weponsDmg);
    }

    @Override
    public void attackDmg(Hero hero) {
        int dmg = this.weaponsDmg + BattleUnits.getRndStrength(1, 10);
        hero.hp -= dmg;
        BattleUnits.logAttack(this, dmg, hero);

    }
}
