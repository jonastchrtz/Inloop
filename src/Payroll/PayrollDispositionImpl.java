package Payroll;

import java.util.HashMap;
import java.util.Map;

public class PayrollDispositionImpl implements PayrollDisposition {

    private Map<Employee, Double> payments;

    public PayrollDispositionImpl() {

        this.payments = new HashMap<>();

    }

    public double getTotal() {return payments.keySet().stream().mapToDouble(e -> payments.get(e)).sum();}

    public double getAverage() {return payments.size() == 0 ? 0.0 : getTotal() / payments.size();}

    public Map<Employee, Double> getPayments() {return payments;}

    @Override
    public void sendPayment(Employee empl, double payment) {

        if(payment <= 0) {throw new IllegalArgumentException();}
        if(empl == null) {throw new NullPointerException();}

        payments.put(empl, payment);

    }

}
