package Lineage_v2;

import java.util.Scanner;

public class HumanMage extends Human {
    private int prominence = 40; //mana cost 130
    private int blazingCircle = 40;//mana cost 110
    private int fireVortex = 40;//mana cost 200
    public HumanMage(String name, int hp, int mp, int pDef, int mDef, int pDmg, int mDmg){
        super(name, hp, mp, pDef, mDef, pDmg, mDmg);
    }
    @Override
    public void attack(Hero hero){
        int dmg = this.mDmg;
        hp -= dmg;
        if (BattleUtils.isHadTheChance(25)){
            System.out.println("Choose skill:");
            System.out.println("1: Promineance");
            System.out.println("2: BlazingCircle");
            System.out.println("3: FireVortex");
            Scanner skills = new Scanner(System.in);
            String skillChoosing = skills.next();

        }
        logAttack(this, dmg, hero);
    }
}
