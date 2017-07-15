package oop.cw_03.inheritance;

public class Dog extends Animal {

    private String serveLvl;

    public Dog(String name, int age, String serveLvl) {
        super(name, age);
        this.serveLvl = serveLvl;
    }
}
