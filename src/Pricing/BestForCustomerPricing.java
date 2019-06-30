package Pricing;

public class BestForCustomerPricing extends ComplexPricing {

    public BestForCustomerPricing(ISalePricing pricing) {

        super(pricing);

        if(pricing == null) throw new NullPointerException();

    }

    @Override
    public long getTotal(Sale sale)

    {if(sale == null) throw new NullPointerException();

        long highest_discount = getPricings().get(0).getTotal(sale);

        for(ISalePricing e : getPricings()) {

            if(highest_discount > e.getTotal(sale)) {

                highest_discount = e.getTotal(sale);
            }

        }

        return highest_discount;}

}
