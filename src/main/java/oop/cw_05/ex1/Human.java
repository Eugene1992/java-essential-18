package oop.cw_05.ex1;

public class Human implements Movable {

    private int speed;

    public Human(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int calcDistance(int hours) {
        return speed * hours;
    }
}
