package structural.adapter;

public class SalaryCalculator {
    public double calcSalary(Employee employee){
        return employee.basicSalary*1.5;
    }
}
