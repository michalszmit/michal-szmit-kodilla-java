package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Producers{

    private final String name = "Healthy Shop";
    private final String location = "Lublin";

    public HealthyShop() {
        this.initList();
    }

    List<Product> productList = new ArrayList<>();

    public void initList() {
        Product product = new Product("Lettuce", new BigDecimal(3));
        Product product1 = new Product("Cheese", new BigDecimal(5));
        Product product2 = new Product("Chicken brest", new BigDecimal(10));
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void process() {
    }

    @Override
    public BigDecimal getValue() {
        return BigDecimal.valueOf(0);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}