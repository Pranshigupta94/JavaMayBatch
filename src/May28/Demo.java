package May28;

public class Demo {
    public static void main(String[] args) {
        for (int i=1; i<50; i++){
            if (i>20 && i%2==0) {
               // System.out.println("Test>>" + i);
                continue;
                //break;
            }
             System.out.println(i);
        }
    }
}
