package oop.cw_10.generics;

public class Test {
    public static void main(String[] args) {
        Pair pair1 = new Pair(10, "Hello world!");
        Pair pair2 = new Pair(true, 10.0);

        Object key = pair1.getKey();

        if (key instanceof String) {
            String str = (String) key;

            System.out.println(str.toUpperCase());
        }

        TypedPair typedPair = new TypedPair("", 10);

        String key1 = typedPair.getKey();

        GenericPair<String, Integer> genericPair1 = new GenericPair<>("", 1);
        GenericPair<Integer, Integer> genericPair2 = new GenericPair<>(1, 1);

        String key2 = genericPair1.getKey();
        Integer key3 = genericPair2.getKey();
    }
}
