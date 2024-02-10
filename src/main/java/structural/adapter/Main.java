package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Salma";
        employee.basicSalary = 5000;

        Manager manager = new Manager();
        manager.name = "salma";
        manager.basicSalary = 15000;

        SalaryAdapter salaryAdapter = new SalaryAdapter();
        System.out.println("Employee Salary : " + salaryAdapter.calcSalary(employee));
        System.out.println("Manager Salary : " + salaryAdapter.calcSalary(manager));
    }
}
