package com.kodilla.good.patterns.challenges.allegro;

public class OrdersRepository implements OrderRepository{

    @Override
    public void createOrder(Buyer buyer, Product product) {
        System.out.println("A new purchase request has been created: " + product);
    }
}