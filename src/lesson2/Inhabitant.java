package lesson2;

public class Inhabitant {

    protected int income;

    public int taxableIncome() {

        return income;

    }

    public int tax() {

        double tax = 0.1;
        double d_income = (double) taxableIncome();
        double d_real_tax = 1;


        if (taxableIncome() >= (d_real_tax / tax)) {

            d_real_tax = d_income * tax;

        }

        return (int) d_real_tax;


    }

    public void setIncome(int income) {

        this.income = income;

    }

}
