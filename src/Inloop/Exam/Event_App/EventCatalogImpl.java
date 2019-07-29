package Inloop.Exam.Event_App;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EventCatalogImpl extends TreeMap<Event, Set<Time>> implements EventCatalog  {

    private HashMap<Event, Set<Time>> catalog = new HashMap<>();

    @Override
    public boolean addCatalogEntry(Event e, Set<Time> tSet) {

        if(tSet.contains(null)) {throw new NullPointerException();}

        for (Map.Entry<Event, Set<Time>> entry : catalog.entrySet()) {

            System.out.println(entry.getKey().compareTo(e));

            if (entry.getKey().compareTo(e) == 0) {
                return false;
            } else {
                catalog.put(e, tSet);
            }
        }

        return true;

    }

    @Override
    public boolean addTimeToEvent(Event e, Time t) {

        if(t == null) {throw new NullPointerException();}

        if (!(catalog.containsKey(e))) {
            return true;
        }
        if (catalog.get(e).contains(t)) {
            return false;
        }

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
