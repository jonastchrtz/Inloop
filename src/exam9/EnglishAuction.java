package exam9;

public class EnglishAuction extends Auction {

    @Override
    public String generateItemString(Item item) {

        if (item == null) {
            throw new NullPointerException();
        }

        String string = "";


        if (item.getAllBids().isEmpty()) {
            string = string + item.toString() + "\nNo bids placed";
        } else {
            string = string + item.toString() + "\n" + "Highest bid: " + item.getHighestBid().toString();
        }

        return string;

    }

}
