package oop.cw_05.ex1;

public class Test {
    public static void main(String[] args) {
        Movable car = new Car(240);
        Movable human = new Human(35);
        Movable cat = new Cat(50);
        Movable wind = new Wind(150);

        calcDistance(3, new Movable[]{car, human, cat, wind});

    }

    public static void calcDistance(int hours, Movable[] movables) {
        for (Movable movable : movables) {
            System.out.println(movable.calcDistance(hours));
        }
    }
}
