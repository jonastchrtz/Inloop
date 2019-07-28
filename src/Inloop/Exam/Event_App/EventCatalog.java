package Inloop.Exam.Event_App;

import java.util.Map;
import java.util.Set;

public interface EventCatalog {

    public boolean addCatalogEntry(Event e, Set<Time> tSet);

    public boolean addTimeToEvent(Event e, Time t);

    public Set<Event> getAllEvents();

    public Set<Time> getTimesOfEvent(Event e);

    public Map<Event, Set<Time>> filterByEventCategory(EventCategory category);

    public Set<Time> deleteEvent(Event e);

    public boolean deleteTime(Event e, Time t);

}
