package designPrinsiples.SRP.after;

public class EmployeeDao {
    public Employee getEmployee(int id){
        // do something
        return new Employee("Salma ", 1000);
    }
}
