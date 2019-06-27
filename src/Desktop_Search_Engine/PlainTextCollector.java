package Desktop_Search_Engine;

import java.util.*;

public class PlainTextCollector implements KeywordCollector {

    @Override
    public Set<String> getKeywords(Resource res) {

        if (res == null) {throw new NullPointerException();}

        TextFileIterator tfi = new TextFileIterator(res);

        HashSet<String> result = new HashSet<>();

        while(tfi.hasNext()){result.add(tfi.next());}

        return result;

    }
}
