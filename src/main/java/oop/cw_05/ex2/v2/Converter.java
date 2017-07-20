package oop.cw_05.ex2.v2;

public class Converter {

    private IPrinter printer;
    private IScanner scanner;

    public Converter(IPrinter printer, IScanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }

    public void setScanner(IScanner scanner) {
        this.scanner = scanner;
    }

    public void convert() {
        String data = scanner.scan();
        data = data.toUpperCase();
        printer.print(data);
    }
}
