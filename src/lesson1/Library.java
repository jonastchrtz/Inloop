package lesson1;

public class Library {

   private Book [] myBooks;

   private int number;

   public Library() {

	   myBooks = new Book[10];
       number = 0;
       System.out.println("Hello, I am a library, which can store up to " + myBooks.length + " books!");

       }

   public void add(Book book) {

       if (number < 10) {

           myBooks[number] = book;
           number += 1;
           System.out.println("I added the book " + book + "!");

       } else {

           System.out.println("The library is full!");
       }

   }

   public Book search(String title) {

       for (Book book : myBooks) {

           if (book == null) {

               continue;

           }
           if (book.toString().equals(title)) {

               System.out.println("The book with the title " + title + " exists in the library!");
               return book;

           }

       }

       System.out.println("The book with the title " + title + " does not exist in the library!");
       return null;

   }

    public void loan(String title) {

        Book loan = search(title);

        if (loan == null) {

            return;

        }

        if (loan.getState()) {

            System.out.println(loan.toString() + " ist bereits ausgeliehen!");
            return;

        }

        loan.setState(true);
        System.out.println(loan.toString() + " wurde ausgeliehen!");
    }

}