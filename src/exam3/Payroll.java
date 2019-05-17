package exam3;

public class Payroll {

    private int payday;
    private PayrollDisposition disposition;

    public Payroll(PayrollDisposition disposition, int payday) {

        if(disposition == null) {throw new NullPointerException();}
        if(!(payday <= 31 && payday >= 1)) {throw new IllegalArgumentException();}


        this.disposition = disposition;
        this.payday = payday;

    }

    public void doPayroll(PayrollDB db) {

        if(db == null) {throw new NullPointerException();}

        for (Employee e: db.getEmployeeList()) {

            if(e.isPayday(payday)){

                try {

                    disposition.sendPayment(e, (e.calculatePay() - e.calculateDeductions()));

                } catch (UnpayableEmployeeException ignored) {}

            }

        }

    }
}
