package war_heroes_v3;

// TODO: 18.07.2017 UNFINISHED 
public class Dwarf extends Heroe {
    //ABILITIES

    //CONSTRUCTOR
    public Dwarf(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    @Override
    public void attack(Heroe heroe) {
        int dmg = this.attack * rnd(1, 4);
        heroe.hp -= dmg;
        logAttack(this, dmg, heroe);
    }
}
