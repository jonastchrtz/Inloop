package exam2;

public class SingleComponent extends Part {

    public SingleComponent(String id, String name) {

        super(id, name);

        if (id.isEmpty() | name.isEmpty()) {throw new IllegalArgumentException();}

    }
}
