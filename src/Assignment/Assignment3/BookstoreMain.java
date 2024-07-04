package Assignment.Assignment3;

public class BookstoreMain {
    public static void main(String[] args) {
Bookstore b1 = new Bookstore("Habit",  150, 10);
        Bookstore.calculateTotalPrice(150, 10);
        b1.bookDetails();

        Bookstore b2 = new Bookstore("Atomic",  153, 2);
        Bookstore.calculateTotalPrice(153, 2);
        b2.bookDetails();
        Bookstore b3 = new Bookstore("Wuthering heights",  111, 4);
        Bookstore.calculateTotalPrice(111, 4);


        b3.bookDetails();

    }
}
