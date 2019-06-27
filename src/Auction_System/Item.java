package Auction_System;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String name;
    private String description;
    private long minPrice;
    private List<Bid> allBids;
    private Bid highestBid;

    public Item(String name, String description, long minPrice) {

        if (name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (minPrice <= 0) {
            throw new IllegalArgumentException();
        }


        this.name = name;
        this.description = description;
        this.minPrice = minPrice;
        this.allBids = new ArrayList<>();

    }

    public void addBid(Person bidder, long price) {

        if (bidder == null) {
            throw new NullPointerException();
        }
        if (price <= 0) {
            throw new IllegalArgumentException();
        }

        if (allBids.isEmpty() && price >= minPrice) {

            allBids.add(new Bid(bidder, price));
            highestBid = new Bid(bidder, price);

        }

        if (price >= minPrice && price > highestBid.getPrice()) {

            allBids.add(new Bid(bidder, price));
            highestBid = new Bid(bidder, price);

        }

    }

    public List<Bid> getAllBids() {
        return allBids;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    public String toString() {
        return name + ": " + description + " (minimum bidding price: " + minPrice + " EUR)";
    }

}
