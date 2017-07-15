package oop.cw_03.inheritance;

public class Cat extends HomeCat { // is a

    private String lazyLevel;

    public Cat(String name, int age, String lazyLevel, String home) {
        super(name, age, home);
        this.lazyLevel = lazyLevel;
    }

    public String getLazyLevel() {
        return lazyLevel;
    }
}
