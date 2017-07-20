package oop.cw_05.ex2.v2;

public class MockScanner implements IScanner {

    private String mock = "Hello world";

    public String scan() {
        return mock;
    }
}
