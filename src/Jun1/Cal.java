package Jun1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cal {
    Scanner scanner =new Scanner(System.in);

    public void sum(){

        System.out.println("Enter the first number");

        int a = scanner.nextInt();

        System.out.println("Enter the second number");

        int b = scanner.nextInt();

        int sum =a+b;

        System.out.println("Sum is :"+sum);

    }
    public void diff(){

        System.out.println("Enter the first number");

        int a = scanner.nextInt();

        System.out.println("Enter the second number");

        int b = scanner.nextInt();

        int diff =a-b;

        System.out.println("Difference is :"+diff);

    }
    public void multiplication(){

        System.out.println("Enter the first number");

        int a = scanner.nextInt();

        System.out.println("Enter the second number");

        int b = scanner.nextInt();

        int multiplication =a*b;

        System.out.println("Multiplication is :"+multiplication);

    }
    public void div(){

        System.out.println("Enter the first number");

        int a = scanner.nextInt();

        System.out.println("Enter the second number");

        int b = scanner.nextInt();

        double div =a/b;

        System.out.println("Division is :"+div);

    }
}
