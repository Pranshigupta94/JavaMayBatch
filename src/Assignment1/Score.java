package Assignment1;

//Write a program that takes a student's score as input and prints out their corresponding grade based on the following criteria:
//Grade Score A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: Below 60


import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score");
        int score= scanner.nextInt();

        if (score>=90 && score<=100){
            System.out.println("Got A");
        } else if (score>=80 && score<=89) {
            System.out.println("Got B");
        }else if (score>=70 && score<=79) {
            System.out.println("Got C");
        }else if (score>=60 && score<=69) {
            System.out.println("Got D");
        }else  {
            System.out.println("Got F");
        }
    }
}
