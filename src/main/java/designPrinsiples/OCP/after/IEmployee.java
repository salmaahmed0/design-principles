package designPrinsiples.OCP.after;

public abstract class IEmployee {
    private int id;
    private String name;
    private double basicSalary;

    public IEmployee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
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


    public abstract double calcHoursBonus(double hours);

    @Override
    public String toString(){
        return "Employee: id= "+id + ", Name= " + name;
    }
}
