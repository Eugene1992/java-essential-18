package oop.cw_03.inheritance;

public class Duck extends Animal {

    private String swimLvl;

    public Duck(String name, int age, String swimLvl) {
        super(name, age);
        this.swimLvl = swimLvl;
    }


}
