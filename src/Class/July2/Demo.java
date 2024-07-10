package Class.July2;

public class Demo {
    public static void main(String[] args) {
        String s = "Prgara";
        String uppercase = s.toUpperCase();
        System.out.println(uppercase);

        String s1 = null;
        System.out.println(s1);
        uppercase = s1.toUpperCase(); // exception occur here because of operation perform on null
        System.out.println(uppercase);


    }
}
