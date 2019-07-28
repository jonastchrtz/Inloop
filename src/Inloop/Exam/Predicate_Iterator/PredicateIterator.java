package Inloop.Exam.Predicate_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PredicateIterator <T> implements java.util.Iterator{

    private List<T> list;
    private T nextObject;
    //private T argument;

    private Iterator<T> iter;
    private Predicate<T> pred;

    public PredicateIterator(Iterator<T> iter, Predicate<T> pred, T argument) {

        this.iter = iter;
        this.pred = pred;
        //this.argument = argument;
        this.list = new ArrayList<>();

        while(iter.hasNext()) {
            T current = iter.next();
            if (pred.predicate(current, argument)) {
                list.add(current);
            }
        }

        if (!(list.size() == 0)) {

            nextObject = list.get(0);
            list.remove(0);

        }

    }

    @Override
    public boolean hasNext() {return nextObject != null;}

    @Override
    public Object next() {

        if (!hasNext()) throw new NoSuchElementException();

        T currentObject = nextObject;

        if (list.size() == 0) {

            nextObject = null;
            return currentObject;

        }

        nextObject = list.get(0);
        list.remove(0);
        return currentObject;

    }

    @Override
    public void remove() {throw new UnsupportedOperationException();}

}
