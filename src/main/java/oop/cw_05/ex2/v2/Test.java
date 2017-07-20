package oop.cw_05.ex2.v2;

public class Test {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        ConsoleRevertPrinter consoleRevertPrinter = new ConsoleRevertPrinter();

        ConsoleScanner consoleScanner = new ConsoleScanner();
        MockScanner mockScanner = new MockScanner();

        Converter converter = new Converter(consolePrinter, consoleScanner);

        converter.convert();

        converter.setPrinter(consoleRevertPrinter);

        converter.convert();

        converter.setScanner(mockScanner);

        converter.convert();
    }
}
