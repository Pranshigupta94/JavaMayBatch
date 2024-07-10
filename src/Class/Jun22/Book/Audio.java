package Class.Jun22.Book;

public class Audio extends OnlineBook {

    String voiceOf;

    public Audio(int numOfPages, String bookName, String author, int length, String voiceOf) {
        super(numOfPages, bookName, author, length);
        this.voiceOf = voiceOf;
    }


}
