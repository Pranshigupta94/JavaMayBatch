package AssignmentString;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        int vowel = 0;
        int consonant=0;
        Scanner sc = new Scanner(System.in);

     //   String str = "I am learning Java";
        System.out.println("Enter the Word to check it is vowel or consonants");
        String str = sc.nextLine();
        System.out.println( str.length());

        // str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel
            if(Character.isLetter(str.charAt(i))){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vowel++;
            }
            //Checks whether a character is a consonant
            else {//if(!Character.isSpaceChar(str.charAt(i)))  {//str.charAt(i)!=' '
                //Increments the consonant counter
                consonant++;
            }
        }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);






    }
}
