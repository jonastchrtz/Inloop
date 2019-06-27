package exam9;

public class AllPayAuction extends Auction {


    @Override
    public String generateItemString(Item item) {

        String string = "";

        if (item.getAllBids().isEmpty()) {
            string = string + item.toString() + "\nNo bids placed";
        } else {
            string = string + item.toString() + "\n" + "Highest bid: " + item.getHighestBid().toString() + "\n" + generateAllBidsString(item);
        }

        return string;
    }
}
