package oop.cw_10;

import oop.cw_02.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
//        Object o = new Object();
//
//        o = null;
//
//        System.out.println(o.hashCode());
//        System.out.println(10 / 0);

        File file = new File("C:\\Users\\Evgeniy\\Desktop\\test666.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            try {
                file.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }


    }


    static void f(){
        f();
    }
}
