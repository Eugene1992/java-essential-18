package oop.cw_06;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] ints = {2, 5, 12, 3, 10, 7};

        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        int rndInts[] = new int[10];
        Arrays.fill(rndInts, 0, 4, 777);

        System.out.println(Arrays.toString(rndInts));


    }
}
