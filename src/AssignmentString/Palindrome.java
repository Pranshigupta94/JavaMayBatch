package AssignmentString;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s1, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        s1 = sc.nextLine();

        int length = s1.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + s1.charAt(i);

        if (s1.equals(rev))
            System.out.println(s1+" is a palindrome");
        else
            System.out.println(s1+" is not a palindrome");


    }
}
