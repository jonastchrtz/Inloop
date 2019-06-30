package Pricing;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplexPricing implements ISalePricing{

    private List<ISalePricing> pricings = new ArrayList<>();

    public ComplexPricing(ISalePricing pricing) {

        pricings.add(pricing);

    }

    public ComplexPricing() {}

    public void add(ISalePricing pricing) {

        if(pricing == null) throw new NullPointerException();

        pricings.add(pricing);}

    public List<ISalePricing> getPricings() {return pricings;}

}
