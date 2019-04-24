package lesson4;

import java.util.*;

public class Library {

    private List <Book> stock = new ArrayList <> ();

    public void sortedInsertion(Book newBook) {

        stock.add(newBook);
        Collections.sort(stock);

    }

    public Book searchForIsbn(String isbn) {

        if (Collections.binarySearch(stock, new Book(isbn)) >= 0) {

            return stock.get(Collections.binarySearch(stock, new Book(isbn)));

        }

        return null;

    }

    public Collection <Book> searchForAuthor (String author) {

        Collection <Book> search_list = new ArrayList <> ();

        for (Book book : stock) {

            if (author.equals(book.getAuthor())) {

                search_list.add(book);
            }
        }

        return search_list;

    }

}
