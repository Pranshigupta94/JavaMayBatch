package Class.July16;

import java.util.Scanner;
import java.util.TreeSet;

public class NamesDemo {

    public static void main(String[] args) {

        System.out.println("Enter the names : ");

        Scanner scanner = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        
        String names ;
         while (true){

             names = scanner.next();

              if (names.equals("ok")){
                  break;
              }set.add(names);

         }System.out.println(set);







    }
}
