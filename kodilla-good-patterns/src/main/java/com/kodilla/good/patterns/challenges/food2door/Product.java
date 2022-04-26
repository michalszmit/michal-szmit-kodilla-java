package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;

public class Product implements Producers {

    private final String product;
    private final BigDecimal value;

    public Product(String product, BigDecimal value) {
        this.product = product;
        this.value = value;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return '\n' + product +
                ", worth: " + value + " PLN";
    }

    @Override
    public void process() {
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }
}