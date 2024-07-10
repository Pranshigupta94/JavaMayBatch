package Class.June15;

public class StringDemo {
    public static void main(String[] args) {
        String st = new String("Hello world");
        StringBuffer st1 = new StringBuffer("hello world");

        st.concat("!");// It will not print ! mark as string is immutable

        st1.append("!");
        // append is same as concat used for string buffer, ! will print because it is mutable.// string buffer can be modified.

        st1.insert(6, "Java ");

        System.out.println(st);
        System.out.println(st1);



    }
}


