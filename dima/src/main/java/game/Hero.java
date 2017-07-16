package game;

/**
 * Created by D_ma on 15.07.2017.
 */
public class Hero {
    protected String name;
    protected double hp;
    protected int armor;
    protected int damage;


    Hero (String name, double hp, int armor, int damage) {
        this.name = name;
        this.hp=hp;
        this.armor=armor;
        this.damage=damage;

    }

    public  String getName() {return name;}

    public double gethp() {return hp;}

    public int getarmor() {return armor;}

    public int getdamage() {return damage;}




    public void attack (Hero Hero2) {
        int dmg = this.damage * random(1, 10);
        Hero2.hp -= dmg;
        logattack (this, dmg, Hero2);

    }
    public boolean alive () { return this.hp > 0;}

    private void logattack(Hero attack, int dmg, Hero def) {
        System.out.printf("%s make an attack! %s damage dealt: %d. %s health left: %d\n\n",
                attack.name, attack.name, dmg, def.name, def.hp );
    }

    private int random(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;

    }


}



