package Assignment.Assignment2;

//write java program to find the sum of first 10 natural numbers

public class Nat {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        do{
            sum += i;
            i++;
        }
        while(i<10);

        System.out.println("Sum of 10 natural number is : " + sum);

    }
}
