package Class.July16;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(30);
        set.add(90);
        set.add(20);
        set.add(30);
        set.add(250);
        set.add(230);

        TreeSet<Integer> set1 = new TreeSet<>();

        set.add(100);
        set.add(130);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(150);
        set.add(30);

        System.out.println("Tree Set " +set);

        System.out.println(set.headSet(40));

        System.out.println(set.tailSet(60));

        System.out.println(set.last());

        System.out.println(set.addAll(new TreeSet<>()));




    }
}
