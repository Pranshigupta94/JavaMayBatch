package Class.June25.InnerClass;

public class OuterClassDemo {
    static class InnerClassDemo{

        public void show(){
            System.out.println("Inner class method..");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // outer class object
       // OuterClassDemo outerClassDemo = new OuterClassDemo();

        // syntax to create inner class object

        OuterClassDemo.InnerClassDemo obj = new OuterClassDemo.InnerClassDemo();
        obj.show();
    }

}
