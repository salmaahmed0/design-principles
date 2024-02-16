package designPrinsiples.SRP.after;

public class Main {
    public static void main(String[] args) {
        EmployeeDao em = new EmployeeDao();
        PrintingManager printer = new PrintingManager();

        Employee employee = em.getEmployee(1);
        printer.printPaySlip(employee);
    }
}
