package exam2;

public class Part {

    private String id;
    private String name;

    public Part(String id, String name){

        if (id.isEmpty() | name.isEmpty()) {throw new IllegalArgumentException();}

        this.id=id;
        this.name=name;

    }

    public String getId() {return id;}

    public String getName() {return name;}

}
