package oop.cw_07.inner;

public class Test {
    public static void main(String[] args) {

        Ship.Engine engine = new Ship("Titanik").new Engine(10);

        String name = engine.getName();
        System.out.println(name);
    }
}
