package oop.cw_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrayList = new LinkedList<>();

        arrayList.add("A"); // 0
        arrayList.add("B"); // 1
        arrayList.add("C"); // 2
        arrayList.add("D"); // 3

        System.out.println(arrayList);

        arrayList.remove(1);

        System.out.println(arrayList);

        arrayList.set(0, "a");

        System.out.println(arrayList);

        arrayList.add(0, "A");

        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
    }
}
