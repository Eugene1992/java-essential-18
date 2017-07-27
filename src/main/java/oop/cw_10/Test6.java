package oop.cw_10;

public class Test6 {
    public static void main(String[] args) {

        try {
            throw new IllegalHeroHealthValueException("Oops! Wtf here!");
        } catch (IllegalHeroHealthValueException e) {
            e.printStackTrace();
        }
    }
}
