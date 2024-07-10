package Class.Jun22.Book;

public class BookMain {
    public static void main(String[] args) {

        OnlineBook onlineBook = new OnlineBook(150, "Five point someone", "Chetan Bhagat", 200);
        onlineBook.bookInfo();

        Fiction fiction = new Fiction(200, "Atomic Habits", "James", "self help book");
        fiction.bookInfo();

        Audio audio = new Audio(125, "ABC", "XYZ", 111, "Female");

        audio.bookInfo();

    }
}
