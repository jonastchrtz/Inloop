package exam2;

public class Purchasing implements StockObserver {

    protected ReceivingStock receivingStock;

    public Purchasing(ReceivingStock receivingStock) {

        if(receivingStock == null) {throw new NullPointerException();}

        this.receivingStock = receivingStock;

    }

    public void buy(Part part, int count) {

        if(part == null) {throw new NullPointerException();}
        if (count < 1) {throw new IllegalArgumentException();}

        receivingStock.insert(part, count);

    }

    public ReceivingStock getStock() {return receivingStock;}

    @Override
    public void onPartCountChanged(Part part, int count) {

       if (count < getStock().getMinStockItems()) {

            buy(part, receivingStock.getMaxStockItems() - receivingStock.parts.get(part));

        }

    }

}
