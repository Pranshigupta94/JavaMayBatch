package Class.June8;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        int[] rollNumbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of array :");

        for (int i = 0; i < rollNumbers.length ; i++) {
            rollNumbers[i] = scanner.nextInt();


        }
        for (int i = 0; i < rollNumbers.length ; i++) {
            System.out.println("Roll Numbers :" + rollNumbers[i]);

        }


    }
}
