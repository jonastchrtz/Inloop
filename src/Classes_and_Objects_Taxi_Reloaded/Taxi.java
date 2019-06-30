package Classes_and_Objects_Taxi_Reloaded;

import java.util.ArrayList;

public class Taxi {

    private Human driver;
    private ArrayList<Human> passengers;

    public Taxi(Human driver) {

        passengers = new ArrayList<>();
        this.driver = driver;
    }

    public String getDriverName() {
        return driver.toString();
    }

    public void add(Human x) {

        if (passengers.size() < 4) {

            passengers.add(x);
            System.out.println(x.toString() + " gets in.");

        } else {

            System.out.println("We are sorry, " + x.toString() + "." + " The taxi is full.");
        }
    }

    public String toString() {

        switch (passengers.size()) {
            case 0:
                return "This is the taxi of " + getDriverName() + ". He takes nobody along.";


            case 1:
                return "This is the taxi of " + getDriverName() + ". He takes " + (passengers.get(0)).toString() + " along.";


            case 2:
                return "This is the taxi of " + getDriverName() + ". He takes " + (passengers.get(0)).toString() + " and " + (passengers.get(1)).toString() + " along.";


            case 3:
                return "This is the taxi of " + getDriverName() + ". He takes " + (passengers.get(0)).toString() + ", " + (passengers.get(1)).toString() + " and " + (passengers.get(2)).toString() + " along.";


            case 4:
                return "This is the taxi of " + getDriverName() + ". He takes " + (passengers.get(0)).toString() + ", " + (passengers.get(1)).toString() + ", " + (passengers.get(2)).toString() + " and " + (passengers.get(3)).toString() + " along.";

            default:
                return null;
        }

    }

    public Human[] allGetOut() {

            Human[] arr = passengers.toArray(new Human[0]);
            passengers.clear();
            return arr;

    }

}
