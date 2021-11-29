package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public interface NotificationService {
    void sendNotificationConfirm(Buyer buyer, Map<Product, Integer> products);
    void sendNotificationNegate(Buyer buyer, Map<Product, Integer> products);
}
