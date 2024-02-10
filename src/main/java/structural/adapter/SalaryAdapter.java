package structural.adapter;

public class SalaryAdapter extends SalaryCalculator{
    Employee employee ;
    public double calcSalary(Manager manager){
        employee = new Employee();
        employee.basicSalary = manager.basicSalary;
        return super.calcSalary(employee);
    }
}
