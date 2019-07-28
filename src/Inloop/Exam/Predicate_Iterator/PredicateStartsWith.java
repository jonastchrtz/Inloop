package Inloop.Exam.Predicate_Iterator;

public class PredicateStartsWith <T extends String> implements Predicate {

    @Override
    public boolean predicate(Object element, Object argument) {

        if(element == null || argument == null) {return false;}

       return ((String) element).startsWith((String) argument);

    }

}
