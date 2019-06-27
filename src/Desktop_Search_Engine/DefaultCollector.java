package Desktop_Search_Engine;

import java.util.*;

public class DefaultCollector implements KeywordCollector {

    public Set<String> getKeywords(Resource res) {

        if (res == null) {throw new NullPointerException();}

        return Collections.singleton(res.getName());

    }
}

