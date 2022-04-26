package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producers {

    private final String location = "Radom";
    private final String name = "Extra food shop";

    public ExtraFoodShop() {
        this.initList();
    }

    List<Product> productList = new ArrayList<>();

    public void initList() {
        Product product = new Product("Carrot", new BigDecimal(3));
        Product product1 = new Product("Potato", new BigDecimal(4));
        Product product2 = new Product("Butter", new BigDecimal(10));
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

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}