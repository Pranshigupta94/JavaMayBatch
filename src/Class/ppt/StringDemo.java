package Class.ppt;

public class StringDemo {
    public static void main(String[] args) {

        String name1 = "Java"; // creates string object in string Pool
        /*
        Does not create string object in string pool as this "Java"
        literal already present there
         */
        String name2 = "Java";
        /*
        name3 and name1 are pointing to same string literal "Java"
         */
        String name3 = name1;


        String name4 = new String("Java");
        /*
        creates new object in heap and does not create new object
        in string pool as it already present there
         */
        String name5 = new String("Java");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);

        System.out.println(name1 == name4);
        System.out.println(name1 == name5);
        System.out.println(name4 == name5);
        // there is no sharing of storage for the same contents of different string objects.

        System.out.println(name1.equals(name4));
        //  name.equals() checked the content of two string objects and hence returned true as they have the same value


    }
}
















