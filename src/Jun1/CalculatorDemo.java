package Jun1;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        System.out.println("Welcome to My calculator");

        System.out.println("1. Press 1 for Addition");

        System.out.println("2. Press 2 for Subtraction");

        System.out.println("3. Press 3 for Division");

        System.out.println("4. Press 4 for Multiplication");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");

        Cal calculator = new Cal();

        int input = scanner.nextInt();

        switch(input){

            case 1:
                calculator.sum();
                break;
        }

        switch(input){

            case 2:
                calculator.diff();
                break;
        }
        switch(input){

            case 4:
                calculator.multiplication();
                break;
        }
        switch(input){

            case 3:
                calculator.div();
                break;
        }


    }
}
