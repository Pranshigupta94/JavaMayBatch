package July9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("ID - 101");
        list.add("First Name -Pranshi");
        list.add("Last Name - Gupta");
        list.add("pranshi@gmail.com");
        list.add("City - Mississauga");




        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
