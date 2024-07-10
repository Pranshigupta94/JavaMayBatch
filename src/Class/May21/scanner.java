package Class.May21;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int x= scanner.nextInt();
        System.out.println("Enter the second numb");

        int y = scanner.nextInt();
        System.out.println("company name");
        String company = scanner.next();

        int sum = x+y;

        System.out.println("sum of 2 no =" + sum);



    }



}
