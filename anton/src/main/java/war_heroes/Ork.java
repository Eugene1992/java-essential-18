package war_heroes;

public class Ork {
    //Common

    private String heroName;
    private int hp;
    private int armor;
    private int maxDmg;
    private int minDmg;

    //Constructor

    Ork(String heroName, int hp, int armor, int maxDmg, int minDmg){
        this.heroName = heroName;
        this.hp = hp;
        this.armor = armor;
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
    }

    //getters and setters

    public String getHeroName(){
        return heroName;
    }
    public void setHeroName(){
        this.heroName = heroName;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(){
        this.hp = hp;
    }
    public int getArmor(){
        return armor;
    }
    public void setArmor(){
        this.armor = armor;
    }
    public int getMaxDmg(){
        return maxDmg;
    }
    public void setMaxDmg(){
        this.maxDmg = maxDmg;
    }
    public int getMinDmg(){
        return minDmg;
    }
    public void setMinDmg(){
        this.minDmg = minDmg;
    }
}
