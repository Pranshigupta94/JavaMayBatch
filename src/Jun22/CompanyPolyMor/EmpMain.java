package Jun22.CompanyPolyMor;

public class EmpMain {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Pranshi");
        employee.calculatePay();

        FullTimeEmp fulltime = new FullTimeEmp(102,"Pranshi", 10000);
        fulltime.calculatePay();

        PartTimeEmp partTimeEmp = new PartTimeEmp(103, "Priya", 20);
        partTimeEmp.calculatePay();
    }
}
