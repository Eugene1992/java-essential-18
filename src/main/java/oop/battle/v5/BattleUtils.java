package oop.battle.v5;

import java.util.List;

public class BattleUtils {

    private BattleUtils() {
    }

    public static int getRandomDamage(int min, int max) {
        return getRandNum(min, max);
    }

    public static int getRandomArrayIndex(List<Hero> heroes) {
        return getRandNum(0, heroes.size() - 1);
    }

    private static int getRandNum(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void logAttack(Hero attacker, int dmg, Hero defender) {
        System.out.printf("%s make an attack! %s damage dealt: %d. %s health left: %d\n\n",
                attacker.name, attacker.name, dmg, defender.name, defender.health);
    }

    public static boolean isHadTheChance(int percent) {
        return getRandomDamage(1, 100) < percent;
    }
}
