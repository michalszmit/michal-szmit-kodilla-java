package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        Buyer buyer = new Buyer("John","Doe", "jdoe@gmail.pl");
        Product product = new Product("Laptop", 1, new BigDecimal(3500));

        OrderRequest orderRequest = new OrderRequest(buyer, product);
        ProductOrderService productOrderService = new ProductOrderService(new EmailNotifier(), new ProductsOrder(), new OrdersRepository());

        productOrderService.process(orderRequest);
    }
}