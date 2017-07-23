package oop.cw_07.inner;

import java.io.Serializable;

public class Ship extends SuperShip {
    private String name;
    private static final int NUM = 777;
    private Engine engine = new Engine(100);

    public Ship(String name) {
        this.name = name;
    }

    public void run() {
        engine.on();
        System.out.println(super.superShipName);
    }

    public class Engine extends SuperEngine implements Serializable {

        private double volume;
//        public static int k; // Inner classes cannot have static declarations

        public Engine(double volume) {
            this.volume = volume;
        }

        public void on() {
            System.out.println(Ship.this.name);
            System.out.println(Ship.super.superShipName);
            System.out.println(this.volume);
            System.out.println(super.superEngineName);
            System.out.println(NUM);
            run();
        }

        public String getName() {
            return name;
        }
    }
}
