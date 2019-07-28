package Inloop.Exam.Pricing;

public class BestForStorePricing extends ComplexPricing {

    public BestForStorePricing(ISalePricing pricing) {

        super(pricing);

        if(pricing == null) throw new NullPointerException();

    }

    @Override
    public long getTotal(Sale sale) {

        if(sale == null) throw new NullPointerException();

        long lowest_discount = getPricings().get(0).getTotal(sale);

        for(ISalePricing e : getPricings()) {

            if(lowest_discount < e.getTotal(sale)) {

                lowest_discount = e.getTotal(sale);
            }

        }

        return lowest_discount;

    }
}
