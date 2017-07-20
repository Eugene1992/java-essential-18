package gamev3;

/**
 * Created by D_ma on 17.07.2017.
 */
public class Hero {

    protected String name;
    protected double hp;
    protected double armor;
    protected double weaponDmg;
    protected double minStrength;
    protected double maxStrength;



    public Hero (String name, double hp, double armor, double weaponDmg, double minStrength, double maxStrength) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.weaponDmg = weaponDmg;
        this.minStrength = minStrength;
        this.maxStrength = maxStrength;
    }

    public String getName() {return name;}
    public double getHp () {return hp;}
    public double getArmor () {return armor;}
    public double getWeaponDmg () {return weaponDmg;}
    public double getMinStrength () {return minStrength;}
    public double getMaxStrength () {return maxStrength;}

    public void dmg (Hero hero) {

        double strength = rndStrength(this.minStrength, this.maxStrength);
        double dmg = strength + this.weaponDmg;
        hero.hp -= protection(dmg);
        logAttack(this, dmg, hero);
    }

    private void logAttack(Hero attacker, double dmg, Hero defender) {
        System.out.println(attacker.name + " is attacked " + defender.name + "take damage " + dmg + " left HP: " + defender.hp);
    }


    public double protection(double dmg) {
       double protection = dmg - armor;
       return protection;
    }

    public boolean isAlive() {
        return this.hp > 0;}


    public double rndStrength(double minStrength, double maxStrength) {
        maxStrength = maxStrength - minStrength;
        return (double) (Math.random() * ++maxStrength) + minStrength;
    }
    public void commentatorVoice () {System.out.println(getName() +" is the winner");}

    }


