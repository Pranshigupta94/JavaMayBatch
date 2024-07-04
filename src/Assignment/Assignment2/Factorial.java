package Assignment.Assignment2;

//Implement a program to find the factorial of a given number using a while loop.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = scanner.nextInt();

        int i=1;
        int factorial =1;

        while (i<=num){

            factorial = factorial * i;
            i++;

        }
        System.out.println("Factorial of " + num + " is :" +factorial );
    }

}
