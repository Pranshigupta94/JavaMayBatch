package June25.InnerClass;

abstract public class Anonymous {
    public abstract void test();
}
class MainTest {
    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous() {
            @Override
            public void test() {
                System.out.println("HI");
            }
        };
    }}