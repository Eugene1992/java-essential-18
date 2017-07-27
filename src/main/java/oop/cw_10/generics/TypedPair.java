package oop.cw_10.generics;

public class TypedPair {

    private String key;
    private Integer value;

    public TypedPair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }
}
