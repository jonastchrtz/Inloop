package lesson4;

import java.util.*;

public class Library {

    private List <Book> stock = new ArrayList();

    public void sortedInsertion(Book newBook) {


    }

    public Book searchForIsbn(String isbn) {

        if (Collections.binarySearch(stock, new Book(isbn)) >= 0) {

            return new Book(isbn);

        }

        return null;

    }

    public Collection<Book> searchForAuthor (String author) {

        return null;
    }

}
