package Class.Jun4;

public class Student {
    int id;
    String name;

    public Student(){
        System.out.println("Default construct");

    }
    public Student(int id){
        this.id =id;

    } public Student(int id, String name){
       this();
       this.id =id;
        this.name =name;


    }
    public void printStudentDetails(){
        System.out.println(this.id);
        System.out.println(name);
    }
}
