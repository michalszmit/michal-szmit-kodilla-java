package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public interface OrderValidator {
    boolean validateOrder(Buyer buyer, Map<Product, Integer> products);
}
