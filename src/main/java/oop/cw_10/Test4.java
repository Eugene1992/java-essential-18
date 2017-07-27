package oop.cw_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("Finally!");
        }

        System.out.println("End");

        try {
            f();
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                ArithmeticException ex = (ArithmeticException) e;
            }
        }
    }

    public static void f() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("");
    }
}
