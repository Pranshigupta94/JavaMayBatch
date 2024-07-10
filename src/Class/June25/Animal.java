package Class.June25;
import static Class.June25.Animal.x;
public interface Animal {
    int x = 10;  // variables in interface are by default public static final

    // methods are by default public abstract
    void eat();
    void run();
}


class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
        System.out.println(x);
    }

    @Override
    public void run() {
        System.out.println("Dog can run.");
    }
}
class Main1 {
    public static void main(String[] args) {

        //Dog dog = new Dog();

        Animal dog = new Dog(); //Upcasting...assigning child class reference to the parent class object.
        System.out.println(x);

        dog.eat();
        dog.run();
    }
}
