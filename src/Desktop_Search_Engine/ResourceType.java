package Desktop_Search_Engine;

public class ResourceType {

    private String description;
    private KeywordCollector collector;

    public ResourceType(String desc, KeywordCollector collector) {

        if (collector == null) {throw new NullPointerException();}

        this.collector = collector;

        if (desc.isEmpty()) {throw new IllegalArgumentException();}

        this.description = desc;

    }

    public String getDescription() {

        return description;
    }

    public KeywordCollector getCollector() {

        return collector;
    }

}
