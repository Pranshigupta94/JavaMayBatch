package Assignment.AssignmentArrays;

import java.util.Arrays;

public class SecondMaxMin {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};
        Arrays.sort(arr);
        System.out.println(" Second Min Element : " + arr[1]);
        System.out.println("Second Max Element : "+ arr[arr.length-2]);
    }
}
