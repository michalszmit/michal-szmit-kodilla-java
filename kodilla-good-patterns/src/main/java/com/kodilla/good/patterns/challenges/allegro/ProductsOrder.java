package com.kodilla.good.patterns.challenges.allegro;

public class ProductsOrder implements ProductOrder{

    @Override
    public boolean order(Buyer buyer, Product product){

        if(product != null){
            System.out.println("Cart of " + buyer + " contains: " + product);
        }
        return true;
    }
}