package game;


public class UnitHumanShooter extends Hero {

    public UnitHumanShooter(String name, int hp, int armor, int minStrength, int maxStrength, int weponsDmg) {
        super(name, hp, armor, minStrength, maxStrength, weponsDmg);
    }


    @Override
    public void attackDmg(Hero hero) {
        int dmg = this.weaponsDmg;
        if (BattleUnits.getChanceCriticalDmg() < 95){
            dmg = this.weaponsDmg * 10;
        }
        hero.hp -= dmg;
        BattleUnits.logAttack(this, dmg, hero);


    }



}

