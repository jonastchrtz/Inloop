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

        if (parts.containsKey(part)){
            int new_amount = this.parts.get(part) + amount;
            parts.put(part, new_amount);
        } else {
            parts.put(part, amount);
        }
        this.notifyPartCountChanged(part, this.parts.get(part));
        return true;

    }

    @Override
    public boolean remove(Part part, int amount) {

        return super.remove(part, amount);

    }

    public void notifyPartCountChanged(Part part, int amount) {

        observers.onPartCountChanged(part, amount);

    }

}
