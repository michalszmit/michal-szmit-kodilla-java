package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public class PurchaseBasket implements StoreStock {
    @Override
    public void confirmAvailability(Buyer buyer, Map<Product, Integer> products) {
        System.out.println("Product: " + products + " available on stock");
    }
}
