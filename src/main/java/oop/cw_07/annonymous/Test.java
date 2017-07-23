package oop.cw_07.annonymous;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex"){
            @Override
            public void makeVoice() {
                System.out.println("Trully I'm Cat!");
            }
        };

        animal.makeVoice();

        class LocalMovable implements Movable {

            @Override
            public int calcDistance() {
                return 10;
            }
        }

        int value = calc(new LocalMovable(), 2);

        int value2 = calc(() -> 10, 10);

        System.out.println(value);
        System.out.println(value2);
    }

    static int calc(Movable movable, int hours) {
        return movable.calcDistance() * hours;
    }
}
