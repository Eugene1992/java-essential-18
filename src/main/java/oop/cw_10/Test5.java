package oop.cw_10;

import java.io.FileInputStream;

public class Test5 {
    public static void main(String[] args) {

        int age = -10;

        g(age);

    }

    static void g(int age) {
        f(age);
    }

    static void f(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }

}
