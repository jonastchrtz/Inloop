package Desktop_Search_Engine;

public class Resource {

    private String name;
    private String path;
    private ResourceType rt;

    public Resource (String name, String path, ResourceType rt) {

        if (name.isEmpty() | path.isEmpty()) {throw new IllegalArgumentException();}

        this.name = name;
        this.path = path;

        if (rt == null) {throw new NullPointerException();}

        this.rt = rt;
    }

    public String getName() {return name;}

    public String getPath() {return path;}

    public ResourceType getType() {return rt;}
}
