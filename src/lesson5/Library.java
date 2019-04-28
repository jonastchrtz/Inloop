package lesson5;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    private Set <Book> stock = new TreeSet<> ();

    public boolean insertBook(Book newBook) {

        if (stock.contains(newBook))

            return false;

        stock.add(newBook);
        return true;

    }

    public Book searchForIsbn(String isbn) {

        for (Book f : stock) {

            if (f.getIsbn().equals(isbn)) {

                return f;

            }

        }

        return null;

    }

    public Collection <Book> searchForAuthor (String author) {

        /*

        Collection <Book> search_list = new ArrayList <> ();

        for (Book book : stock) {

            if (author.equals(book.getAuthor())) {

                search_list.add(book);
            }
        }

        return search_list;

         */

        return stock.stream()
                .filter(e -> author.equals(e.getAuthor()))
                .collect(Collectors.toSet());

    }

    public Map <String, Set <Book>> listStockByAuthor() {

        Map <String, Set <Book>> stock_author = new TreeMap<> ();


        for (Book e : stock) {

            Set<Book> author_set = new TreeSet<> (searchForAuthor(e.getAuthor()));
            stock_author.put(e.getAuthor(), author_set);

        }

        return stock_author;

        }

}
