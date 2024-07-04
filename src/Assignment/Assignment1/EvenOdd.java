package Assignment.Assignment1;

//Write a program that takes an integer as input and prints out whether it is even or odd.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        boolean result = num%2==0;
                if(result)
                {
                    System.out.println("Number is even");
                }
                else {
                    System.out.println("No is odd");
                }
    }
}
