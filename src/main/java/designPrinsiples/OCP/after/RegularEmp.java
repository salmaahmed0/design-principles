package designPrinsiples.OCP.after;

public class RegularEmp extends IEmployee{
    public RegularEmp(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    public double calcHoursBonus(double hours) {
        return ((getBasicSalary()/30) / 8 ) * hours;
    }
}
