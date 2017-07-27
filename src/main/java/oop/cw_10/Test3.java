package oop.cw_10;

public class Test3 {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("Finally!");
        }

        System.out.println("End");
    }
}
