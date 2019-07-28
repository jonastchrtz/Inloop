package Inloop.Exam.Event_App;

import java.util.*;

public class EventCatalogImpl extends TreeMap<Event, Set<Time>> implements EventCatalog  {

    private TreeMap<Event, Set<Time>> catalog = new TreeMap<>();

    @Override
    public boolean addCatalogEntry(Event e, Set<Time> tSet) {

        if(tSet.contains(null)) {throw new NullPointerException();}

        if(catalog.containsKey(e.getTitle())) {System.out.println("Uff " + e);return false;}

        catalog.put(e, tSet);

        System.out.println(e);

        return true;

    }

    @Override
    public boolean addTimeToEvent(Event e, Time t) {

        if(t == null) {throw new NullPointerException();}

        if(!(catalog.containsKey(e))) {return false;}

        catalog.get(e).add(t);

       return false;

    }

    @Override
    public Set<Event> getAllEvents() {return catalog.keySet();}

    @Override
    public Set<Time> getTimesOfEvent(Event e) {return catalog.get(e);}

    @Override
    public Map<Event, Set<Time>> filterByEventCategory(EventCategory category) {

        if(category == null) {throw new NullPointerException();}
        return null;
    }

    @Override
    public Set<Time> deleteEvent(Event e) {

        if(e == null) {throw new NullPointerException();}
        return null;
    }

    @Override
    public boolean deleteTime(Event e, Time t) {

        if(e == null || t == null) {throw new NullPointerException();}
        return false;
    }
}
