package Assignment1;

//Create a program that takes a character (a-z or A-Z) as input and determines whether it is a vowel or a consonant.

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");

        char ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + " is a consonant");
        }
    }
}
