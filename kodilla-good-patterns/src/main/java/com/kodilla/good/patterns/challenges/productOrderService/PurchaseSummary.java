package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Objects;

public class PurchaseSummary {

    private final Buyer buyer;
    private final boolean isPurchased;

    public PurchaseSummary(Buyer buyer, boolean isPurchased) {
        this.buyer = buyer;
        this.isPurchased = isPurchased;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseSummary that = (PurchaseSummary) o;
        return isPurchased == that.isPurchased && Objects.equals(buyer, that.buyer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyer, isPurchased);
    }
}