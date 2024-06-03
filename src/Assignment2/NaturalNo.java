package Assignment2;

// write a java program to find the sum of n natural numbers?

public class NaturalNo {
    public static void main(String[] args) {
       int i=1;
       int sum = 0;
       do{
           sum += i;
           i++;
       }
       while(i<100);

        System.out.println("Sum of 100 natural number is : " + sum);

    }
}
