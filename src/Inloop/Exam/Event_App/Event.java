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

        if(title.equals(o.getTitle())) {return category.compareTo(o.getCategory());}

        return title.compareTo(o.getTitle());

    }
}
