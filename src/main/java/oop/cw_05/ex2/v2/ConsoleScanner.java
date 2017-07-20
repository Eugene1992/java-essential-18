package oop.cw_05.ex2.v2;

import java.util.Scanner;

public class ConsoleScanner implements IScanner {

    private Scanner scanner = new Scanner(System.in);

    public String scan() {
        return scanner.next();
    }
}
