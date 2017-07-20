package oop.cw_05.ex1;

public class Cat implements Movable {

    private int speed;

    public Cat(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int calcDistance(int hours) {
        return speed * hours;
    }
}
