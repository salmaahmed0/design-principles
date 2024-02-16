package designPrinsiples.ISP.before;

public class MultiFunctionPrinterImpl implements MultiFunctionPrinter{
    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void copy() {
        System.out.println("copy");
    }

    @Override
    public void scan() {
        System.out.println("scan");
    }

    @Override
    public void sendFax() {
        System.out.println("sendFax");
    }
}
