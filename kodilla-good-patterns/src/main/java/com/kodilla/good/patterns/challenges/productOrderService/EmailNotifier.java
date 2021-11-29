package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public class EmailNotifier implements NotificationService {
    @Override
    public void sendNotificationConfirm(Buyer buyer, Map<Product, Integer> products) {
        System.out.println("A new purchase order has been created: " +
                "\n" + "Buyer: " + buyer +
                " has purchased: " + products +
                "\nThank you for shopping at Kodilla store");
    }

    @Override
    public void sendNotificationNegate(Buyer buyer, Map<Product, Integer> products) {
        System.out.println("Dear customer, your order basket is currently empty: " +
                "\n" + "Buyer: " + buyer +
                " has selected: " + products +
                "\nPlease select the number of items you wish to purchase");
    }
}
