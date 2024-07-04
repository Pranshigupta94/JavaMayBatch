package Assignment.Assignment2;

// write product table for given no in specific format eg 5 * 1 = 5

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++ ){
            System.out.println(n +  "x" + i + "=" +(n*i));


        }

    }
}
