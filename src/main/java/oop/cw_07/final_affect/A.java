package oop.cw_07.final_affect;

public final class A {

    public final int k = 10;

    public final int c;

    public A(int c) {
        this.c = c;
    }

    public void f() {
        final int d = 10;

//        d = 100;
    }
}
