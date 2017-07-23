package Lineage;

public class BattlleUtils {
    private BattlleUtils() {

    }

    private static int getRandNum(int min, int max) {
        max = max - min;
        return (int) (Math.random() * ++max) + min;
    }

    public static boolean isHadTheChance(int percent) {
        return getRandNum (1, 200) < percent;
    }
}
