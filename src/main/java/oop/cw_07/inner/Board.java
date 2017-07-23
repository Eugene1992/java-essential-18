package oop.cw_07.inner;

public class Board {
    private String name;
    public static final int NUM = 77;

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void staticMethod(Board ship) {
        System.out.println(ship.name);
    }

    public void noStaticMethod() {
        System.out.println(this.name);
    }
}
