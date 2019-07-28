package Inloop.Exam.Pricing;

public class Sale {

    private long preDiscountTotal;
    private ISalePricing pricing;

    public Sale(long preDiscountTotal, ISalePricing pricing) {

        if(preDiscountTotal <= 0) throw new IllegalArgumentException();
        if(pricing == null) throw new NullPointerException();

        this.preDiscountTotal = preDiscountTotal;
        this.pricing = pricing;

    }

    public long getPreDiscountTotal() {return preDiscountTotal;}

    public void setPricing(ISalePricing pricing) {

        if(pricing == null) throw new NullPointerException();
        this.pricing = pricing;
    }

    public long getTotal() {return pricing.getTotal(new Sale(preDiscountTotal,pricing));}

    public static ISalePricing createPricing(DiscountType discountType, double percentage, long discount, long threshold) {

        switch (discountType) {

            case PERCENTAGEDISCOUNT:
                return new PercentageDiscountPricing(percentage);

            case ABSOLUTEDISCOUNT:
                return new AbsoluteDiscountPricing(discount, threshold);

            default: return null;

        }
    }
}

