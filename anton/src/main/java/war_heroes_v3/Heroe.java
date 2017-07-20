package war_heroes_v3;

import war_heroes_v2.Hero;

// TODO: 18.07.2017 UNFINISHED
public abstract class Heroe {
    //COMMON STAFF

    protected String name;
    protected int hp;
    protected int attack;

    public Heroe(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp() {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack() {
        this.attack = attack;
    }

    //METHODS

    public abstract void attack(Heroe heroe); //ABSTRACTED METHOD FOR EACH CLASS

    protected void logAttack(Heroe attacker, int dmg, Heroe defender) {
        System.out.printf("%s attacked %s and damaged him: %d, %s left: %d \n\n",
                attacker.name, defender.name, dmg, defender.name, defender.hp);
    }

    public boolean isAlive() {

        return this.hp > 0;
    }


    public void victoryVoice() {
        System.out.println(name + " is the winner");
    }

    public int rnd(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }

   /* public void firstPlayer() {
        Heroe[] heroes = new Heroe[4];
        heroes[0] = new Paladin(name, hp, attack);
        heroes[1] = new Dwarf(name, hp, attack);
        heroes[2] = new Elf(name, hp, attack);
        heroes[3] = new Ork(name, hp, attack);
    }*/

    public void firstPlayer() {
        Heroe[] heroes = {new Paladin(name, hp, attack), new Dwarf(name, hp, attack), new Elf(name, hp, attack), new Ork(name, hp, attack)};
        Heroe firstGroup = heroes[0];
        for (int i = heroes.length - 1; i < heroes.length / 2; i--) {
            heroes[i] = firstGroup;
        }
    }

    public void secondPlayer() {
        Heroe[] heroes = {new Paladin(name, hp, attack), new Dwarf(name, hp, attack), new Elf(name, hp, attack), new Ork(name, hp, attack)};
        Heroe secondGroup = heroes[0];
        for (int i = heroes.length / 2 - 1; i >= 0; i--) {
            heroes[i] = secondGroup;
        }
    }

    /*public void groupBattlle(Heroe[] heroes) {
        int dmg = this.attack;
        firstGroup -= dmg;
    }*/
}

