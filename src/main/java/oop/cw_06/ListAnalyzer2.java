package oop.cw_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAnalyzer2 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            al.add(null);
        }
        long end = System.currentTimeMillis();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            ll.add("Hello world");
        }
        long end1 = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
