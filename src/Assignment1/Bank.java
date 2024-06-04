package Assignment1;

//Write a program that takes a bank account balance as input and prints out whether the account
// is in overdraft (balance < 0), has a low balance (balance between 0 and 100), or has a healthy balance (balance > 100).

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter bank account balance : ");
        double balance = scanner.nextDouble();

        if (balance>100){
            System.out.println("Account has a healthy balance ");
            
        } else if (balance>=0 && balance<=100) {
            System.out.println("Account has a low balance");

        }else{
            System.out.println("Account is in overdraft");
        }


    }
}
