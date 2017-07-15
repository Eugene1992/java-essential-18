package oop.cw_03.comp_aggr;

public class Test {
    public static void main(String[] args) {
        Freshener freshener = new Freshener("El");
        Car car1 = new Car("Tesla-X", "Blue", freshener);

        car1.run();

        car1 = null;



    }
}
