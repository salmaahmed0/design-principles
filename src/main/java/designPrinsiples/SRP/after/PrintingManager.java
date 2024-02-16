package designPrinsiples.SRP.after;

public class PrintingManager {
    public void printPaySlip(Employee employee){
        System.out.println("Payslip");
        System.out.println("Name : " + employee.getName());
        System.out.println("Salary : " + employee.getSalary());
    }
}
