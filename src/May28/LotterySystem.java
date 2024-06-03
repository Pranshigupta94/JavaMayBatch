package May28;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            int luckyNumber = 21;
            System.out.println("Enter number between 1 to 100");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num== luckyNumber ) {
                System.out.println("You won the lottery");
                break;
            }
                else{
                    System.out.println("Better luck next time");
                    continue;
                }
            }



        }
    }

