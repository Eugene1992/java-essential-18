package war_heroes_v3;
// TODO: 18.07.2017 UNFINISHED 
import war_heroes_v2.Hero;

public class Ork extends Heroe {
    //ABILITIES

    //CONSTRUCTOR
    public Ork(String name, int hp, int attack) {
        super(name, hp, attack);
    }
    @Override
    public void attack(Heroe heroe) {
        int dmg = this.attack;
        hp -= dmg;
        logAttack(this, dmg, heroe);
    }
}
