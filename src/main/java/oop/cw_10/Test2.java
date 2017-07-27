package oop.cw_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {

//         FileInputStream fileInputStream = new FileInputStream(""); // checked

        try {
            System.out.println(10 / 0);
            Object o = null;
            o.hashCode();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException!");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException!");
        } catch (Exception e) {
            System.out.println("Exception!");
        } finally {
            System.out.println("Finally!");
        }

        System.out.println("End");
    }


    static void f(){
        f();
    }
}
