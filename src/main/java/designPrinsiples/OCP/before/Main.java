package designPrinsiples.OCP.before;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(10, "Salma", 900);
        employee1.setEmpType("Manager");

        Employee employee2 = new Employee(10, "Salma", 900);
        employee2.setEmpType("Regular");

        System.out.println(employee1.toString()+ " \nBonus= " + employee1.calcHoursBonus(5));
        System.out.println(employee2.toString()+ " \nBonus= " + employee2.calcHoursBonus(5));
    }
}
