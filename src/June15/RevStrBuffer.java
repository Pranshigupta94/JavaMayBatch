package June15;

public class RevStrBuffer {
    public static void main(String[] args) {
        String str = "Hello World";

        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println(buffer);

    }
}
