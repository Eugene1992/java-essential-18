package oop.cw_05.ex2.v2;

public class ConsoleRevertPrinter implements IPrinter {

    public void print(String data) {
        System.out.println(new StringBuilder(data).reverse().toString());
    }
}
