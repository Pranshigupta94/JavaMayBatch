package Jun22.Book;

public class  Book {

    int numOfPages;
    String bookName;
    String author;

    public Book(int numOfPages, String bookName, String author) {
        this.numOfPages = numOfPages;
        this.bookName = bookName;
        this.author = author;
    }

    public void bookInfo(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("length: " + numOfPages);
    }

}
