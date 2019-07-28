package Inloop.Basics.Classes_and_Objects_Taxi;

public class Human {

    private String forename;
    private String name;

    public Human(String forename, String name) {

        this.forename = forename;
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getForename() + " " + getName();
    }
}
