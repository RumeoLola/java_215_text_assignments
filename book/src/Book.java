public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int pages;

    // Constructor
    public Book(String title, String author, int yearPublished, int pages) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year: " + yearPublished + "\n" +
                "Pages: " + pages;
    }
}