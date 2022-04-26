package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;

public class Product {
    private String item;
    private int quantity;
    private BigDecimal price;

    public Product(String item, int quantity, BigDecimal price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int amount) {
        this.quantity = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + item  +
                ", " + quantity + " PCS" + ", " +  price + " PLN";
    }
}