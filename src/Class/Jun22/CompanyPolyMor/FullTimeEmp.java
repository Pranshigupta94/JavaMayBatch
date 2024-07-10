package Class.Jun22.CompanyPolyMor;

public class FullTimeEmp extends Employee {
    int salary;

    public FullTimeEmp(int employeeId, String name, int salary) {
        super(employeeId, name);
        this.salary = salary;
    }

    @Override
    public void calculatePay() {
        System.out.println("Emp name: " + name);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
