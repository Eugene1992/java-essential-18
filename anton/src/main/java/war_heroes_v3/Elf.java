package war_heroes_v3;

public class Elf extends Heroe {
    public Elf(String name, int hp, int attack) {
        super(name, hp, attack);
    }
    @Override
    public void attack(Heroe heroe){
        int dmg = this.attack * rnd(1, 4);
        heroe.hp -= dmg;
        logAttack(this, dmg, heroe);
    }
}