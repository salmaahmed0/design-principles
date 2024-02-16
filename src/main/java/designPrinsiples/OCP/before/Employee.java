package designPrinsiples.OCP.before;

public class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private String empType;

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calcHoursBonus(double hours){
        if(empType.equals("Manager")){
            return (((basicSalary/30) / 8 ) * hours) *2;
        }
        return ((basicSalary/30) / 8 )*hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basicSalary=" + basicSalary +
                ", empType='" + empType + '\'' +
                '}';
    }
}
