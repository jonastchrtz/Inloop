package lesson2;

public class Noble extends Inhabitant{

    @Override

    public int tax() {

        double tax = 0.1;
        double d_income = (double) income;
        double d_real_tax = 20;


        if (taxableIncome() >= (d_real_tax / tax)) {

            d_real_tax = d_income * tax;

        }

        return (int) d_real_tax;


    }
}
