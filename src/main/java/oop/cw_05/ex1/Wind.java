package oop.cw_05.ex1;

import java.io.Serializable;

public class Wind implements Movable, Cloneable, Serializable {

    private int speed;

    public Wind(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int calcDistance(int hours) {
        return speed * hours;
    }
}
