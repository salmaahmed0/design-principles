package designPrinsiples.ISP.before;

public class Main {
    public static void main(String[] args) {
        // Clients should not be forced to depend on methods they don't use.

        MultiFunctionPrinter printer = new MultiFunctionPrinterImpl();

        printer.print();
        printer.sendFax();
    }
}
