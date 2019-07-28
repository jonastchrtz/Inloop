package Inloop.Exam.Part_Management;

public class Resource extends Part {

    public Resource(String id, String name) {

        super(id, name);

        if (id.isEmpty() | name.isEmpty()) {throw new IllegalArgumentException();}

    }
}
