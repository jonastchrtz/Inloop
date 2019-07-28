package Inloop.Exam.Renovation_Project;

public class Paint extends Material {

    private static double limit = 0.02;
    private int noOfCoats;
    private double noOfSqMPerLiter;

    public Paint(String name, double price, int noOfCoats, double noOfSqMPerLiter) {

        super(name, price);

        if(noOfCoats <= 0 || noOfSqMPerLiter <= 0) {throw new IllegalArgumentException();}

        this.noOfCoats = noOfCoats;
        this.noOfSqMPerLiter = noOfSqMPerLiter;

    }

    public int getNoOfCoats() {
        return noOfCoats;
    }

    public double getNoOfSqMPerLiter() {
        return noOfSqMPerLiter;
    }

    public int getMaterialReq(Surface s) {

        double req = ((s.getArea() * noOfCoats) / noOfSqMPerLiter);

        double req_rounded = Math.round(((s.getArea() * noOfCoats) / noOfSqMPerLiter) * 100) / 100;

        double rest = req - req_rounded;

        int buckets = ((int) req) * 2;

        if(rest >= limit) {

            if (rest >= 0.5 + limit) {buckets += 2;}

            else {buckets++;}

        }

        return buckets;

    }

}
