package Assignment.AssignmentArrays;

public class Average {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


        }
        int average = sum / arr.length;
        System.out.println(+average+ " is the total average of the element");
    }

    }
