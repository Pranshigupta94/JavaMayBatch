package Assignment.AssignmentString;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence to be reversed");
        String s1 = scanner.nextLine();
        StringBuffer buffer = new StringBuffer(s1);
        buffer.reverse();
        System.out.println(buffer);


    }
}
