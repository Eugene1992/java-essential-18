package game;

/**
 * Created by D_ma on 15.07.2017.
 */
public class Hero {
    protected String name;
    protected double hp;
    protected int armor;
    protected int minDmg;
    protected int maxDmg;


    Hero(String name, double hp, int armor, int minDmg, int maxDmg) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    public String getName() {
        return name;
    }

    public double gethp() {
        return hp;
    }

    public int getarmor() {
        return armor;
    }

    public int getminDmg() {
        return minDmg;
    }

    public int getmaxDmg() {
        return minDmg;
    }

    public void attack(Hero defender) {
        int dmg = random(this.minDmg, this.maxDmg);
        defender.hp -= dmg;
        logAttack(this, dmg, defender);
    }

    public boolean alive() {
        return this.hp > 0;
    }

    private void logAttack(Hero attack, int dmg, Hero def) {
        System.out.printf("%s make an attack! %s damage dealt: %d. %s health left: %f\n\n",
                attack.name, attack.name, dmg, def.name, def.hp);
    }

    private int random(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }
}



