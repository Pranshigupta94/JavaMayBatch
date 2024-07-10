package Class.June8;

public class TwoDim {
    public static void main(String[] args) {
        //creating two matrices
        int[][] a ={{10,20,30},{40,50,60},{70,80,90}};
        int[][] b ={{7,8,9},{6,4,2},{1,8,3}};

        //create another matrix to store value
        int[][] c = new int[3][3];  //3 rows and 3 columns
        //adding and printing addition of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];    //use - for add
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }


    }
}
