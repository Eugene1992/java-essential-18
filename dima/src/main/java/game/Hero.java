package game;


public abstract class Hero {

    protected String name;
    protected int hp;
    protected int armor;
    protected int minStrength;
    protected int maxStrength;
    protected int weaponsDmg;


    public Hero(String name, int hp, int armor, int minStrength, int maxStrength, int weaponsDmg) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.minStrength = minStrength;
        this.maxStrength = maxStrength;
        this.weaponsDmg = weaponsDmg;
    }

    public String getName () {return  name;}
    public int getHp () {return hp;}
    public int getArmor () {return armor;}
    public int getMinStrength () {return minStrength;}
    public int getMaxStrength () {return maxStrength;}
    public int getWeaponsDmg () {return weaponsDmg;}

    public abstract void attackDmg (Hero hero);
    public boolean isAlive () {return  this.hp > 0;}

    public void commentatorVoice () {
        System.out.println(name + " is winer!");
    }


}
