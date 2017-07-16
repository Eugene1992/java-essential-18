package war_heroes_v2;

public class Hero {
    // Common Stats
    protected String name;
    protected int hp;
    protected int armor;
    protected int maxDmg;
    protected int minDmg;

    //Constructor

    Hero(String name, int hp, int armor, int maxDmg, int minDmg) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
    }

    //getters / setters
    public String getName() {return name;}

    public void setName() {this.name = name;}

    public int getHp() {return hp;}

    public void setHp() {this.hp = hp;}

    public int getArmor() {return armor;}

    public void setArmor() {this.armor = armor;}

    public int getMaxDmg() {return maxDmg;}

    public void setMaxDmg() {this.maxDmg = maxDmg;}

    public int getMinDmg() {return minDmg;}

    public void setMinDmg() {this.minDmg = minDmg;}

    //Methods
    public void victoryVoice(){
        System.out.println(getName() +" is the greatest");
    }

    public void makeAttack(Hero hero){
        int dmg = rnd(this.minDmg, this.maxDmg);
        hero.hp -= decreaseDmgByArmor(dmg);
        logAttack(this, dmg, hero);
    }

    public int decreaseDmgByArmor(int dmg) {
        // TODO: 16.07.2017 calculate damage decreasing
        return 0;
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    public int rnd(int maxDmg, int minDmg){
        maxDmg = maxDmg - minDmg;
        return (int) (Math.random() * ++maxDmg) + minDmg;
    }

    public void logAttack(Hero attacker, int dmg, Hero defender){

        System.out.println(attacker.name + " is attacked " + defender.name +"! " + defender.name + " take damage " + dmg + " left hp:" + defender.hp);
    }
}
