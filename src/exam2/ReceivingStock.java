package exam2;

public class ReceivingStock extends Stock {

    private int minStockItems;
    private int maxStockItems;

    public ReceivingStock(int minStockItems, int maxStockItems) {

        if (minStockItems < 1 | maxStockItems < 1 | maxStockItems <= minStockItems) {throw new IllegalArgumentException();}

        this.minStockItems = minStockItems;
        this.maxStockItems = maxStockItems;

    }

    public int getMinStockItems() {return minStockItems;}
    public int getMaxStockItems() {return maxStockItems;}

    @Override
    public boolean insert(Part part, int amount) {

        if (amount > getMaxStockItems()) {return false;}

        return super.insert(part, amount);
    }

}
