package designPrinsiples.OCP.after;

public class Main {
    public static void main(String[] args) {
        IEmployee employee1 = new Manager(10, "Salma", 900);

        IEmployee employee2 = new RegularEmp(10, "Salma", 900);

        System.out.println(employee1.toString()+ " \nBonus= " + employee1.calcHoursBonus(5));
        System.out.println(employee2.toString()+ " \nBonus= " + employee2.calcHoursBonus(5));
    }
}
