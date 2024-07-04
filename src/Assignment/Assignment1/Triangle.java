package Assignment.Assignment1;

//Write a program that takes three integers as input representing the lengths of the sides of a triangle
// and determines whether the triangle is equilateral, isosceles, or scalene.

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input");
         int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(x==y && y==z){
            System.out.println("Triangle is equilateral");
        } else if (x==y||y==z||z==x) {
            System.out.println("Triangle is isosceles");

        }else {
            System.out.println("Triangle is scalene");

        }

    }
}
