package designPrinsiples.SRP.before;

public class Main {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();

        Employee employee = em.getEmployee(1);
        em.printPaySlip(employee);
    }
}
