package Class.Jun22.Book;

public class OnlineBook extends Book {
        int length;

    public OnlineBook(int numOfPages, String bookName, String author, int length) {
        super(numOfPages, bookName, author);
        this.length =length;
    }

    @Override
    public void bookInfo() {
        System.out.println("Author of the book: " + author);
        System.out.println("Length of the book : " + length);
    }
}
