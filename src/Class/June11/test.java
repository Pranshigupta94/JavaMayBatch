package Class.June11;

public class test {
    public static void main(String[] args) {
        String s1 = "   Pranshi    ";
        String upperCase = s1.toUpperCase();
        System.out.println(upperCase);

        char c = s1.charAt(2);
        System.out.println(c);

        String concat = s1.concat("   Gupta");
        System.out.println(concat);

        int length = s1.length();
        System.out.println(length);




        String trim = s1.trim();
        System.out.println(trim);

        char[] charArray = s1.toCharArray();
        System.out.println(charArray);

        int i1=11;
        int i = s1.lastIndexOf(i1);
        System.out.println(i);



    }
}
