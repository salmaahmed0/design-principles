package designPrinsiples.OCP.after;

public class Manager extends IEmployee{

    public Manager(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    public double calcHoursBonus(double hours){
        return (((getBasicSalary()/30) / 8 ) * hours) *2;
    }


}
