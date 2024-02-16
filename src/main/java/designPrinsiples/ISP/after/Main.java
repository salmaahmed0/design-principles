package designPrinsiples.ISP.after;

public class Main {
    public static void main(String[] args) {
        Printer printer = new MultiFunctionPrinterImpl();
        printer.print();

        OfficeWorker officeWorker = new MultiFunctionPrinterImpl();
        officeWorker.sendFax();
    }
}
