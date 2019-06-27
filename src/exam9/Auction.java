package exam9;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class Auction {

    private boolean closed;
    private List<Item> allItems;
    private List<Person> bidders;

    public Auction() {

        this.closed = false;
        this.allItems = new ArrayList<>();
        this.bidders = new ArrayList<>();

    }

    public void addBid(String itemName, String nameOfBidder, long price) {

        if (itemName.isEmpty() || nameOfBidder.isEmpty() || price <= 0) {
            throw new IllegalArgumentException();
        }
        if (closed) {
            throw new IllegalStateException();
        }
        if (!toString(allItems).contains(itemName)) {
            throw new NoSuchElementException();
        }

        for (Item e : allItems) {

            if (e.getName().equals(itemName)) {

                e.addBid(new Person(nameOfBidder), price);
                bidders.add(new Person(nameOfBidder));

            }
        }
    }

    public String closeAuction() {

        if (closed) {
            throw new IllegalStateException();
        }

        closed = true;
        return generateItemListString();

    }

    public String generateAllBidsString(Item item) {

        if (item == null) {
            throw new NullPointerException();
        }

        String string = "All bids:";

        for (Bid e : item.getAllBids()) {

            string = string + "\n" + e.toString();

        }

        return string;

    }

    public String generateItemListString() {

        String string = "";

        if (getClass().getSimpleName().equals("EnglishAuction")) {

            for (Item e : allItems) {

                if (e.getAllBids().isEmpty()) {

                    string = string + e.toString() + "\nNo bids placed" + "\n";

                } else {

                    string = string + e.toString() + "\n" + "Highest bid: " + e.getHighestBid().toString() + "\n";

                }
            }

            return string;

        }

        if (getClass().getSimpleName().equals("AllPayAuction")) {

            for (Item e : allItems) {

                if (e.getAllBids().isEmpty()) {

                    string = string + e.toString() + "\nNo bids placed" + "\n";

                } else {

                    string = string + e.toString() + "\n" + "Highest bid: " + e.getHighestBid().toString() + "\n" + generateAllBidsString(e) + "\n";

                }
            }

            return string;

        }

        return string;

    }

    public void registerItem(Item item) {

        if (closed) {
            throw new IllegalStateException();
        }

        for (Item e : allItems) {

            if (e.getName().equals(item.getName())) {

                throw new IllegalArgumentException();

            }
        }

        if (item == null) {
            throw new NullPointerException();
        }

        allItems.add(item);

    }

    public abstract String generateItemString(Item item);

    public List<Item> getAllItems() {
        return allItems;
    }

    public String toString(List<Item> items) {

        String string = "";

        for (Item e : items) {

            string = string + " " + e.getName();
        }

        return string;
    }

}
