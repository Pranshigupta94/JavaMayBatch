

public final class Test {


        // fields of the FinalClassExample class
        private final int id;

        private final String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }


        // Constructor method performing deep copy

        public Test(int i, String n){
            System.out.println("Performing Deep Copy for Object initialization");

            // "this" keyword refers to the current object
            this.id=i;
            this.name=n;

        }

        public static void main(String[] args) {

            String s = "original";

            int i=10;

            Test Emp = new Test(i,s);

            // print the Emp values
            System.out.println("Emp id: "+Emp.getId());
            System.out.println("Emp name: "+Emp.getName());

            // change the local variable values
            i=20;
            s="modified";

            // print the values again
            System.out.println("Employee id after local variable change: "+Emp.getId());
            System.out.println("Employee name after local variable change: "+Emp.getName());


        }

    }

