package oop.cw_03.inheritance;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void maekVoice() {
        System.out.println("Voice");
    }
}
