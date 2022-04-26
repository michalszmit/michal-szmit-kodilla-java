package com.kodilla.good.patterns.challenges.allegro;

public class EmailNotifier implements NotificationService {
    @Override
    public void inform(Buyer buyer, Product product) {
        System.out.println(buyer + " has created a purchase order: " + product + ".");
    }
}
