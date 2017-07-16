package war_heroes_v2;

public class Dwarf extends Hero{
    //Abilities
    int blocking;
    public Dwarf(String name, int hp, int armor, int maxDmg, int minDmg){
        super(name, hp, armor, maxDmg, minDmg);
        this.blocking = blocking;
    }
}
