package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public interface StoreStock {
    void confirmAvailability(Buyer buyer, Map<Product, Integer> products);
}
