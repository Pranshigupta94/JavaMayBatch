package Class.Jun22.CompanyPolyMor;

public class Employee {
    int employeeId;
    String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    public void calculatePay(){
        System.out.println("Calculate the pay");
    }
}
