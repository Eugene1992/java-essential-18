package Lineage_v2;

public class BattleUtils {

    private static int getRandomNumber(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }

    public static boolean isHadTheChance(int percent) {
        return getRandomNumber (1, 200) < percent;
    }
}
