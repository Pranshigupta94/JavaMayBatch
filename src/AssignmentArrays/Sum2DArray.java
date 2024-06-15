package AssignmentArrays;

public class Sum2DArray {
    public static void main(String[] args) {
        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};

        int[][] sum = new int[3][3];
        System.out.println("Sum of two arrays");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=array1[i][j]+array2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
