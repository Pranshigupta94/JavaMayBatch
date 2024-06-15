package June11;

public class StringRev {
    public static void main(String[] args) {

        String s1 = "pranshi";
        System.out.println("String : " + s1);

        System.out.print("Reverse : ");


        char[] ch = s1.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

    }
}
