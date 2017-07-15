package oop.cw_03.comp_aggr;

public class Car {
    private String model;
    private String color;
    private Engine engine = new Engine("Electro"); // composition
    private Freshener freshener;                   // aggregation

    public Car(String model, String color, Freshener freshener) {
        this.model = model;
        this.color = color;
        this.freshener = freshener;
    }

    public void run() {
        engine.on();
        freshener.smell();
        System.out.println("Moving...");
    }
}
