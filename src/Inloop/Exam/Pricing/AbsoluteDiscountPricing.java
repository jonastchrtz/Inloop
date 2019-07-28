package Inloop.Exam.Pricing;

public class AbsoluteDiscountPricing implements ISalePricing {

    private long discount;
    private long threshold;

    public AbsoluteDiscountPricing(long discount, long threshold) {

        if(threshold < 0 || discount < 0) throw new IllegalArgumentException();


        this.discount = discount;
        this.threshold = threshold;

    }

    @Override
    public long getTotal(Sale sale) {

        if(sale == null) throw new NullPointerException();

        long result = sale.getPreDiscountTotal() - discount;

        if(sale.getPreDiscountTotal() < threshold) {return sale.getPreDiscountTotal();}
        if(result < threshold) {return threshold;}
        else {return result;}

    }
}
