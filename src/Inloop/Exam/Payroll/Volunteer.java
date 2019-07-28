package Inloop.Exam.Payroll;

public class Volunteer extends Employee{

    public Volunteer(String id) {

        super(id);

    }

    @Override
    public boolean isPayday(int dayOfMonth) {return false;}

    @Override
    public double calculatePay() throws UnpayableEmployeeException {

        throw new UnpayableEmployeeException("Volunteers aren't payed!");

    }

    @Override
    public double calculateDeductions() {return 0;}

}
