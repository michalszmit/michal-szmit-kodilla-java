package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public class Validator implements OrderValidator {
    @Override
    public boolean validateOrder(Buyer buyer, Map<Product, Integer> products) {
        System.out.println("Checking if order basket is not empty: ");
        boolean found = products.entrySet().stream().filter(e -> e.getValue() > 0).map(e -> true).findAny().orElse(false);
        System.out.println(found);
        return found;
    }
}
