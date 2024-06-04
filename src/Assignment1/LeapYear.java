package Assignment1;

//Create a program that checks if a given year is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();


        boolean b = year % 100 != 0 || year % 400 == 0;
        if ((year%4==0) && b)
        {
            System.out.println(year + " is a Leap year");
        }
        else {
            System.out.println(year + " is not a Leap year");
        }


    }
}
