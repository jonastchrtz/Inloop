package Generics;

public abstract class Wine extends Drink {

    private String region;

    public Wine(String region) {

        this.region = region;

    }

    public String getRegion() {

        return region;

    }

    public String toString() {

        return "Region: " + region;

    }
}
