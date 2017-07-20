package oop.cw_05.ex2.v1;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        Printer printer = new Printer();
        Converter converter = new Converter();

        String data = scanner.scan();
        String convert = converter.convert(data);
        printer.print(convert);

    }
}
