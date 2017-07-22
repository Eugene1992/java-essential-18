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

    public Hero(String name, double hp, double armor, double weaponDmg, double minStrength, double maxStrength) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.weaponDmg = weaponDmg;
        this.minStrength = minStrength;
        this.maxStrength = maxStrength;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getArmor() {
        return armor;
    }

    public double getWeaponDmg() {
        return weaponDmg;
    }

    public double getMinStrength() {
        return minStrength;
    }

    public double getMaxStrength() {
        return maxStrength;
    }




}


