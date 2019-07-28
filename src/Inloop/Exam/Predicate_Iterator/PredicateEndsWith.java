package Inloop.Exam.Predicate_Iterator;

public class PredicateEndsWith <T extends String> implements Predicate {
    @Override
    public boolean predicate(Object element, Object argument) {

        if(element == null || argument == null) {return false;}

        return ((String) element).endsWith((String) argument);
    }

}

