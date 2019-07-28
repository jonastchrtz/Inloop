package Inloop.Lesson.A_Basic_Library;

public class Book {

    private String title;
    private boolean state;

    public Book(String title) {

        this.title = title;
        this.state = false;

        System.out.println("Book " + title + " created.");

    }

    public String toString() {

        return title;

    }

    public boolean getState() {

        return state;

    }

    public void setState(boolean state) {

        this.state = state;

    }
}
