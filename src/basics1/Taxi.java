package basics1;

import java.util.ArrayList;

public class Taxi {

    private Human driver;
    // private Human passenger;
    private ArrayList<Human> pass_list;

    public Taxi(Human driver) {

        pass_list = new ArrayList<Human>();
        this.driver = driver;
    }

    public String getDriverName() {
        return driver.toString();
    }

    public void add(Human x) {

        if (pass_list.size() < 4) {

            pass_list.add(x);
            System.out.println(x.toString() + " gets in.");

        } else {

            System.out.println("We are sorry, " + x.toString() + "." + " The taxi is full.");
        }
    }

    public String toString() {

        int size = pass_list.size();

        switch (size) {
            case 0:
                return "This is the taxi of " + getDriverName() + ". He takes nobody along.";


            case 1:
                return "This is the taxi of " + getDriverName() + ". He takes " + (pass_list.get(0)).toString() + " along.";


            case 2:
                return "This is the taxi of " + getDriverName() + ". He takes " + (pass_list.get(0)).toString() + " and " + (pass_list.get(1)).toString() + " along.";


            case 3:
                return "This is the taxi of " + getDriverName() + ". He takes " + (pass_list.get(0)).toString() + ", " + (pass_list.get(1)).toString() + " and " + (pass_list.get(2)).toString() + " along.";


            case 4:
                return "This is the taxi of " + getDriverName() + ". He takes " + (pass_list.get(0)).toString() + ", " + (pass_list.get(1)).toString() + ", " + (pass_list.get(2)).toString() + " and " + (pass_list.get(3)).toString() + " along.";

            default:
                return null;
        }

    }

    public Human[] allGetOut() {

        /*if (pass_list.size() == 0) {

            return new Human[]{};
        } else { */

            Human[] arr = pass_list.toArray(new Human[pass_list.size()]);

            pass_list.clear();
            return arr;
       // }


    }


}
