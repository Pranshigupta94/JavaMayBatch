package Assignment.Assignment3;
//Create a Java program for a simple online bookstore. Each book has a title, author, price, and quantity available in stock.
// Implement the following functionalities:
//Create a Book class with instance variables for title, author, price, and quantity.
//Implement a constructor to initialize these instance variables.
//Implement a static method in the Book class to calculate the total price of a given quantity of books.
//Create multiple instances of the Book class and demonstrate the use of the constructor and static method.
//You can extend this problem by adding more functionalities like adding books to a shopping cart, updating stock quantities, etc.



public class Bookstore {

    String title;
   static String author = "Dave";
    double price;
    int quantity;

    //constructor

    public Bookstore(String title, double price, int quantity) {
        this.title = title;

        this.price = price;
        this.quantity = quantity;
    }
    //static method implement
    public static void calculateTotalPrice( double price, int quantity){
        System.out.println("Total price = " + (price * quantity));
    }

    public void bookDetails(){
        System.out.println("Title :" + title);
        System.out.println("Author :" + author);

        System.out.println("Price :" + price);
        System.out.println("Quantity : " + quantity);
    }

}
