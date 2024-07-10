package Class.Jun4;

public class CounterDemo {
     int count =0;

    CounterDemo() {
        count++;
        System.out.println(count);
    }

    void test(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();

    }
}




