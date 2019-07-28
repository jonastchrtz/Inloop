package Inloop.Exam.Predicate_Iterator;

public class PredicateLength <T extends String> implements Predicate {

    @Override
    public boolean predicate(Object element, Object argument) {

        if(element == null || argument == null) {return false;}

        int argument_int = Integer.parseInt((String) argument);
        int element_int = ((String) element).length();

        return element_int == argument_int;

    }
}
