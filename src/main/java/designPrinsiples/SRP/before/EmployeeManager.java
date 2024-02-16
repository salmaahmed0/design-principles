package designPrinsiples.SRP.before;

public class EmployeeManager {
    public Employee getEmployee(int id){
        // do something
        return new Employee("Salma ", 1000);
    }

    public void printPaySlip(Employee employee){
        System.out.println("Payslip");
        System.out.println("Name : " + employee.getName());
        System.out.println("Salary : " + employee.getSalary());
    }
}
