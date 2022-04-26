package com.kodilla.good.patterns.challenges.allegro;

public class OrderRequest {

    private Buyer buyer;
    private Product product;

    public OrderRequest(Buyer buyer, Product product){
        this.buyer = buyer;
        this.product = product;
    }

    public Buyer getBuyer(){
        return buyer;
    }

    public Product getProduct(){
        return product;
    }
}