package oop.cw_03.inheritance;

public class Test {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka", 2, "100", "Kiev");

        Animal animal = new Cat("Barsik", 2, "100", "Kiev");

        animal = new Dog("Rex", 3, "100");

        murka.maekVoice();
    }
}
