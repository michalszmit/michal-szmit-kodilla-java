package com.kodilla.good.patterns.challenges.allegro;

public interface OrderRepository {
    void createOrder(Buyer buyer, Product product);
}