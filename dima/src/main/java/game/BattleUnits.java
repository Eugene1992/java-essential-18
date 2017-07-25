package game;


public class BattleUnits {

    public static int getRndStrength(int minStrength, int maxStrength) {
        return getRndNum(minStrength, maxStrength);
    }

    public static int getChanceBlockAttack(int percent) {
        return getRndNum(0, 100);
    }

    public static boolean isChanced(int percent) {
        return getRndNum(0, 100) < percent;
    }


    private static int getRndNum(int min, int max) {
        max = max - min;
        return (int) ((Math.random() * ++max) + min);
    }

    public static void logAttack(Hero attacker, int dmg, Hero defender) {
        System.out.printf("%s make an attack! %s damage dealt: %d. %s health left: %d\n\n",
                attacker.name, attacker.name, dmg, defender.name, defender.hp);
    }

    public static boolean isHadTheChance(int percent) {
        return getRndNum(1, 100) < percent;
    }


}
