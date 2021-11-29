package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PurchaseOrder {

    private final Map<Product, Integer> products = new HashMap<>();
    private Buyer buyer;

    public void add(Product product, Integer amount) {
        products.put(product, amount);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseOrder that = (PurchaseOrder) o;
        return Objects.equals(products, that.products) && Objects.equals(buyer, that.buyer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, buyer);
    }
}