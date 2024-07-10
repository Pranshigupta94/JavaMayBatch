package July9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {

        List<Emp1> list = new ArrayList<>();

        Emp1 e1 = new Emp1(1, "Pranshi", "gupta", "pranshi@gmail.com","Mississauga", 21);
        Emp1 e2 = new Emp1(2, "Manik", "Kumar", "manik@gmail.com", "toronto", 30);
        Emp1 e3 = new Emp1(3, "Priya", "Mahajan", "priya@yahoo.com", "Mississauga", 22);
        Emp1 e4 = new Emp1(4, "riya", "kapoor", "pri@yahoo.com", "Brampton", 24);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        for (Emp1 e : list) {
            if(e.getFirstName().equals("Pranshi")){
                System.out.println(e.getFirstName());


        }}

            System.out.println("get age");
            for (Emp1 em : list) {
                if(em.getAge()>25){
                    System.out.println(em);



                }


        }

    }}

