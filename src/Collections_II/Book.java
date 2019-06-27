package Collections_II;

public class Book implements Comparable<Book> {

    private String isbn;
    private String author = "";
    private String title = "";

    public Book(String isbn, String author, String title) {

        this.isbn = isbn;
        this.author = author;
        this.title = title;

    }

    public Book(String isbn) {

        this.isbn = isbn;

    }

    public String getIsbn() {

        return isbn;

    }

    public String getAuthor() {

        return author;

    }

    public String getTitle() {

        return title;

    }

    public String toString() {

        return title + "; " + author + " (" + isbn + ")";

    }

    public int compareTo(Book b) {

        return getIsbn().compareTo(b.getIsbn());

    }


}
