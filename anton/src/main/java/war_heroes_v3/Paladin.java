package war_heroes_v3;
// TODO: 18.07.2017 UNFINISHED 
import war_heroes_v2.Hero;

public class Paladin extends Heroe {
    //ABILITIES

    //CONSTRUCTOR

    public Paladin(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    @Override
    public void attack(Heroe heroe) {
        int dmg = this.attack * rnd(1, 4);
        heroe.hp -= dmg;
        logAttack(this, dmg, heroe);
    }
}
