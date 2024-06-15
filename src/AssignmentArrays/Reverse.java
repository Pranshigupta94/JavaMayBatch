package AssignmentArrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};

        int size = arr.length;
        System.out.println("Reversed Array is: ");
        for(int i=0; i<size/2;i++)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;
        }
        for(int element : arr)
        {
            System.out.println(element);
        }
    }
}
