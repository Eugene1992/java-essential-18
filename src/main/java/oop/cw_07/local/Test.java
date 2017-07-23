package oop.cw_07.local;

import java.io.Serializable;

public class Test {

    public int name;

    public static void main(String[] args) {

        int val = 10;


        class LocalClass extends Object implements Serializable {
            private int k;

            public LocalClass(int k) {
                this.k = k;
            }

            public void f() {
                System.out.println(val);
            }
        }

        LocalClass a = new LocalClass(10);
    }

    public static void f() {
//        LocalClass a = new LocalClass();
    }
}
