package Inloop.Exam.Renovation_Project;

public class Flooring extends Material {

    private static double limit = 0.02;
    private double widthOfFlooring;

    public Flooring(String name, double price, double width) {

        super(name, price);

        if(width <= 0) {throw new IllegalArgumentException();}
        this.widthOfFlooring = width;

    }

    public double getWidth() {return widthOfFlooring;}

    public int getMaterialReq(Surface s) {

        double req = s.getArea() / widthOfFlooring;

        if(((s.getArea() % widthOfFlooring) * 100) / 100 >= limit) {req++;}

        return (int) req;

    }

}
