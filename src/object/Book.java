package object;

public class Book {

    private  String bookTitle;
    private String bookAuthor;
    private int bookPublicationYear;

    public Book(String bookTitle, String bookAuthor, int bookPublicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublicationYear = bookPublicationYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }
}
