package oop.cw_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAnalyzer {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            al.add(0, null);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
