package gamev3;


public class BattleUnits {

    private BattleUnits() {

    }
    public static double getRndStrength (double minStrength, double maxStrength) {return getRndNum(minStrength , maxStrength);}
    public static double getRndArreyHeroIndexd (Hero[] heroes) {return getRndNum ( 0 , heroes.length -1); }

    private static double getRndNum(double min, double max) {
        max = max - min;
        return (double) (Math.random() * ++max) + min;


    }
    public static void logAttack (Hero attacker, double dmg, Hero defender) {
        System.out.printf("%s make an attack! %s damage dealt: %d. %s hp left: %d\n\n", attacker.name, attacker.name, dmg, defender.name, defender.hp);
    }
}



