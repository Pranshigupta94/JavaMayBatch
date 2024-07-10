package Class.Jun22.CompanyPolyMor;

public class PartTimeEmp extends Employee{
    int hourlyWages;

    public PartTimeEmp(int employeeId, String name, int hourlyWages) {
        super(employeeId, name);
        this.hourlyWages = hourlyWages;
    }

    @Override
    public void calculatePay() {
        System.out.println("Hourly wage: $20");
    }
}
