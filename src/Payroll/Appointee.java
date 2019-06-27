package Payroll;

public class Appointee extends Employee{

    private int payday;
    private int hoursPerMonth;
    private double payPerHour;

    public Appointee(String id, int payday, int hoursPerMonth, double payPerHour) {

        super(id);

        if(!(payday <= 31 && payday >= 1) | hoursPerMonth <= 0 | payPerHour <= 0) {throw new IllegalArgumentException();}

        this.payday = payday;
        this.hoursPerMonth = hoursPerMonth;
        this.payPerHour = payPerHour;

    }

    @Override
    public boolean isPayday(int dayOfMonth) {

        return payday == dayOfMonth;

    }

    @Override
    public double calculatePay() throws UnpayableEmployeeException{

        return hoursPerMonth * payPerHour;

    }

    @Override
    public double calculateDeductions() {

        return hoursPerMonth * payPerHour * 0.4;

    }

}
