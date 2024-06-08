package Jun1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainNameInput {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.next();

        NameInput nameInput = new NameInput();
        System.out.println(nameInput.input(name));
    }

}








// Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("Enter the name");
//        String input( String name){
//            return name;
//String input( String name, String email){
//            return name, email;