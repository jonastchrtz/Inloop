package Inloop.Exam.Event_App;

public class Event implements Comparable<Event> {

    private String title;
    private EventCategory category;

    public Event(String title, EventCategory category) {

        if(title.isEmpty()) {throw new IllegalArgumentException();}
        if(category == null) {throw new NullPointerException();}

        this.title = title;
        this.category = category;

    }

    public String getTitle() {return title;}

    public EventCategory getCategory() {return category;}

    @Override
    public int compareTo(Event o) {

        if(o == null) {throw new NullPointerException();}

        if(!(o.getTitle().equals(title))) {

            if(o.getTitle().length() < title.length()) {return 1;}
            if(o.getTitle().length() > title.length()) {return -1;}
            if(o.getCategory().ordinal() < category.ordinal()) {return 1;}
            if(o.getCategory().ordinal() > category.ordinal()) {return -1;}

        }

        if(o.getTitle().equals(title)) {

            if(o.getCategory().ordinal() < category.ordinal()) {return 1;}
            if(o.getCategory().ordinal() > category.ordinal()) {return -1;}

        }

        return 0;

    }

}
