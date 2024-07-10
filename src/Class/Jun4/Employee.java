package Class.Jun4;
//static
public class Employee {
    int id;
    String name;
   static String company = "Pragra";//memory assigned only once

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }
public void printDetails(){
    System.out.println(id);
    System.out.println(name);System.out.println(company);


}
}
     class EmpMain{
         public static void main(String[] args) {
             Employee e1 = new Employee(21, "Pranshi");

             Employee e2 = new Employee(22, "Manik");
             Employee e3 = new Employee(23, "Mridul");
             e1.printDetails();
             e2.printDetails();
             e3.printDetails();
         }
     }


