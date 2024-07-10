package Class.Jun22.Book;

public class Novel extends Book {
    String genre;

    public Novel(int numOfPages, String bookName, String author, String genre) {
        super(numOfPages, bookName, author);
        this.genre = genre;
        super.numOfPages = numOfPages;
    }
}
