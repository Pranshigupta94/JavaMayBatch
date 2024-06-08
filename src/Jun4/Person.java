package Jun4;

public class Person {
    static{
        System.out.println("Inside static block...."); // its gonna print first if you put in the last still it prints first
    }

    public static void printName(){
        System.out.println("Pragra");
    }
    public void printNothing(){
        System.out.println("something");}
    static{
        System.out.println("Inside static block11"); // its gonna print first if you put in the last still it prints first
    }
    {
        System.out.println("Instance block");//when the object is called it gonna print eg simply .new Person();
    }

}
class Main{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printNothing();
        Person.printName();
    }
}
