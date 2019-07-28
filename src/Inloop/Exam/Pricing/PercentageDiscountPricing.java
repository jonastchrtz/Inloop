package Inloop.Exam.Pricing;

public class PercentageDiscountPricing implements ISalePricing {

    private double percentage;

    public PercentageDiscountPricing(double percentage) {

        if(percentage < 0 || percentage > 100) throw new IllegalArgumentException();

        this.percentage = percentage;

    }

    @Override
    public long getTotal(Sale sale) {

        if(sale == null) throw new NullPointerException();

        return (long) (sale.getPreDiscountTotal() - (sale.getPreDiscountTotal() * (percentage/100)));

    }
}
