package Inloop.Exam.Auction_System;

public class Bid {

    private final long price;
    private final Person bidder;

    public Bid(Person bidder, long price) {

        if (bidder == null) {
            throw new NullPointerException();
        }
        if (price <= 0) {
            throw new IllegalArgumentException();
        }

        this.bidder = bidder;
        this.price = price;

    }

    public Person getBidder() {
        return bidder;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return price + " EUR by " + bidder;
    }

}
