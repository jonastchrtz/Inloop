package Desktop_Search_Engine;

import java.util.*;

public class TextFileIterator implements java.util.Iterator<String> {

    private List<String> words;
    private String nextWord;

    public TextFileIterator (Resource res) {

        if (res == null) {throw new NullPointerException();}

        String text = getAsString(res);

        text = text.replaceAll("-\n(?=[a-z])", "").replaceAll("\\s", " ").replaceAll("\\p{Punct}", "");

        words = new ArrayList<>(Arrays.asList(text.split(" ")));

        nextWord = words.get(0);
        words.remove(0);

    }

    public boolean hasNext() {return nextWord != null;}

    public String next() {

        if (!hasNext()) throw new NoSuchElementException();

        String currentWord = nextWord;

        if (words.size() == 0) {nextWord = null; return currentWord;}

        nextWord = words.get(0);
        words.remove(0);
        return currentWord;

    }

    public void remove() {throw new UnsupportedOperationException();}

    public String getAsString(Resource res) {return "We wish you good luck in this exam!\nWe hope you are well pre-\npared.";}

}

