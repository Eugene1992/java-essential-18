package oop.cw_06;

import java.util.Arrays;

public class ArrayResizeTest {
    public static void main(String[] args) {
        int[] ints = {2, 5, 12, 3, 10, 7};

        ints = Arrays.copyOf(ints, 10);

        System.out.println(ints.length);

        System.out.println(Arrays.toString(ints));
    }
}
