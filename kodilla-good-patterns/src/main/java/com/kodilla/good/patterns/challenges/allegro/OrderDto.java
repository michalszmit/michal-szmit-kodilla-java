package com.kodilla.good.patterns.challenges.allegro;

public class OrderDto {
    public Buyer buyer;
    public boolean isOrdered;

    public OrderDto(final Buyer user, final boolean isOrdered){
        this.buyer = user;
        this.isOrdered = isOrdered;
    }

    public Buyer getBuyer(){
        return buyer;
    }

    public boolean isOrdered(){
        return isOrdered;
    }
}