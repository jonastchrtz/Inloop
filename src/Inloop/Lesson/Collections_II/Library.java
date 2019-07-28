package Inloop.Lesson.Collections_II;

import java.util.*;

public class Library {

    private Set <Book> stock = new TreeSet<> ();

    public boolean insertBook(Book newBook) {

       return stock.add(newBook);

    }

    public Book searchForIsbn(String isbn) {

        for (Book f : stock) {

            if (f.getIsbn().equals(isbn)) {

                return f;

            }

        }

        return null;

    }

    public Set<Book> searchForAuthor(String autor) {

        Set<Book> search_list = new TreeSet<>();

        for (Book book : stock) {

            if (autor.equals(book.getAuthor())) {

                search_list.add(book);
            }
        }

        return search_list;
    }

    public Map <String, Set <Book>> listStockByAuthor() {

        Map <String, Set <Book>> stock_author = new TreeMap<> ();

        for (Book e : stock) {

            if(!stock_author.containsKey(e.getAuthor())) {


                stock_author.put(e.getAuthor(), searchForAuthor(e.getAuthor()));
            }
        }

        return stock_author;

    }

}
