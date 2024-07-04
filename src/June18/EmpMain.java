package June18;

public class EmpMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Pranshi", 100000, new Address("3880 Duke of York", "Mississauga", "ON", "L5B 4M7"));
        Employee employee2 = new Employee(102, "Manik", 100010, new Address("3888 Duke of York blvd", "Toronto", "ON", "L3Y 4R6"));
        Employee employee3 = new Employee(103, "Priya", 100030, new Address("155 queen st", "Oakville", "ON", "L1R 8T7"));


        employee1.address.city ="Oakville";
        System.out.println(employee1);


    }
}