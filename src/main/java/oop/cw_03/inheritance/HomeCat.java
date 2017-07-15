package oop.cw_03.inheritance;

public class HomeCat extends Animal {

    protected String home;

    public HomeCat(String name, int age, String home) {
        super(name, age);
        this.home = home;
    }
}
