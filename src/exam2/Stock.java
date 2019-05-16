package exam2;

import java.util.*;

public abstract class Stock {

    protected Map<Part, Integer> parts;
    protected StockObserver observers;

    public Stock() {

        this.parts = new HashMap<>();

    }

    public int getCount(Part part) {

        if(part == null) {throw new NullPointerException();}

        return parts.getOrDefault(part, -1);

    }

    public boolean insert(Part part, int amount) {

        if (amount < 1) {throw new IllegalArgumentException();}
        if(part == null) {throw new NullPointerException();}

        if (parts.containsKey(part)) {

            parts.put(part, parts.get(part) + amount);
            notifyPartCountChanged(part, this.parts.get(part));

        }

        else {

            parts.put(part, amount);
            notifyPartCountChanged(part, this.parts.get(part));

        }

        return true;

    }

    public boolean remove(Part part, int amount) {

        if (amount < 1) {throw new IllegalArgumentException();}
        if(part == null) {throw new NullPointerException();}

        if(parts.containsKey(part) && parts.get(part) >= amount) {

            parts.put(part, parts.get(part) - amount);
            notifyPartCountChanged(part, parts.get(part));
            return true;

        }

        return false;

    }

    public void addObserver(StockObserver observer) {

        if(observer == null) {throw new NullPointerException();}

        observers = observer;

    }

    public void notifyPartCountChanged(Part part, int amount) {

        try {

            observers.onPartCountChanged(part, amount);

        } catch (NullPointerException e){}

    }

}
