package war_heroes_v2;

public class Elf extends Hero{
    //Abilities
    int critical;
    public Elf(String name, int hp, int armor, int maxDmg, int minDmg){
        super(name, hp, armor, maxDmg, minDmg);
        this.critical = critical;
    }
}
