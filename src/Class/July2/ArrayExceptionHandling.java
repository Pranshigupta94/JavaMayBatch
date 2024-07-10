package Class.July2;

public class ArrayExceptionHandling {
    public static void main(String[] args) {

        int[] arr = new int[5];
        try {
            arr = new int[]{1,2,3,4,5,6,7};

            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }}
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        System.out.println("Testing");

    }
}
