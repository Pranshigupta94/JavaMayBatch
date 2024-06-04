package Assignment1;

//Create a program that takes two numbers as input and prints out whether
// the first number is greater than, less than, or equal to the second number.

import java.util.Scanner;

public class NumInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter first number : ");
        int num2 = scanner.nextInt();

        if(num1==num2){
            System.out.println(num1 + " is equal to " +num2);
        } else if (num1>num2) {

            System.out.println(num1 + " is greater than " +num2);
        }else {
            System.out.println(num1 + " is less than " +num2);
        }
    }
}
