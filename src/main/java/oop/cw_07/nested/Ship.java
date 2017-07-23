package oop.cw_07.nested;

import java.io.Serializable;

public class Ship {

    private String name;
    private static int num = 77;

    static class Engine extends Object implements Serializable {

        private int volume;
        private static String color;

        Engine(int volume) {
            this.volume = volume;
        }

        public void f(Ship ship) {
            System.out.println(num);
            System.out.println(ship.name);
        }

        public static void s() {}
    }
}
