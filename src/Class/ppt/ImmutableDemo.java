package Class.ppt;

public class ImmutableDemo {

    public static void main(String[] args) {

        String s1 = "PRAGRA";
        System.out.println(s1);

        s1.toLowerCase(); //Doesn't impact on original content of s1

        System.out.println(s1);

       String s2 = new String("PRANSHI");
        System.out.println(s2);

        s2.toLowerCase();
        System.out.println(s2);


    }
}
