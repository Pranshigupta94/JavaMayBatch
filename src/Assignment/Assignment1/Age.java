package Assignment.Assignment1;

//Create a program that takes a person's age as input and prints out their corresponding age group:
// child (0-12), teenager (13-19), adult (20-59), or senior (60 and above)

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age= scanner.nextInt();

        if (age>=0 && age<=12){
            System.out.println("Child");
        } else if (age>=13 && age<=19) {
            System.out.println("teenager");
        }else if (age>=20 && age<=59) {
            System.out.println("Adult");
        }else if (age>=60 ) {
            System.out.println("Senior");
        }else  {
            System.out.println("Enter Valid age");
        }

    }
}
