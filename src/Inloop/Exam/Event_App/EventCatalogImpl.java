package Inloop.Exam.Event_App;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EventCatalogImpl extends TreeMap<Event, Set<Time>> implements EventCatalog  {

    @Override
    public boolean addCatalogEntry(Event e, Set<Time> tSet) {

        if(tSet == null || tSet.contains(null)) {throw new NullPointerException();}

        if (!getAllEvents().contains(e)){

            put(e, tSet);
            return true;

        }

        return false;

    }

    @Override
    public boolean addTimeToEvent(Event e, Time t) {

        if(e == null || t == null) {throw new NullPointerException();}

        if(containsKey(e) && !getTimesOfEvent(e).contains(t)) {

            Set<Time> times = get(e);
            times.add(t);
            put(e, times);

            return true;

        }

    return false;

    }

    @Override
    public Set<Event> getAllEvents() {return keySet();}

    @Override
    public Set<Time> getTimesOfEvent(Event e) {return get(e);}

    @Override
    public Map<Event, Set<Time>> filterByEventCategory(EventCategory category) {

        if(category == null) {throw new NullPointerException();}

        Map<Event, Set<Time>> filtered = new TreeMap<>();

        for(Event e : getAllEvents()) {

            if(e.getCategory() == category) {

                filtered.put(e, get(e));

            }
        }

        return filtered;

    }

    @Override
    public Set<Time> deleteEvent(Event e) {return remove(e);}

    @Override
    public boolean deleteTime(Event e, Time t) {

        if(e == null || t == null) {throw new NullPointerException();}

        Set<Time> times = getTimesOfEvent(e);

        if(times!= null && times.contains(t)) {

            times.remove(t);
            addCatalogEntry(e, times);
            return true;

        }

        return false;

    }
}
