package com.kodilla.good.patterns.challenges.food2door;

import java.math.BigDecimal;

public class OrderGenerator implements ProductOrder{

    private Customer customer;
    private Order order;

    @Override
    public void createOrder() {

        Customer customer = new Customer("Jane", "Doe", "jdoe@gmail.com");
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        Order order = new Order(customer, extraFoodShop.productList.get(1), 1);
        Order order1 = new Order(customer, glutenFreeShop.productList.get(1), 3);
        Order order2 = new Order(customer,healthyShop.productList.get(1), 1);

        BigDecimal orderValue = BigDecimal.valueOf(order.getAmount()).multiply(order.getProduct().getValue());
        BigDecimal order1Value = BigDecimal.valueOf(order1.getAmount()).multiply(order1.getProduct().getValue());
        BigDecimal order2Value = BigDecimal.valueOf(order2.getAmount()).multiply(order2.getProduct().getValue());

        System.out.println(order + "Order from  " + extraFoodShop.getName() +
                " " + extraFoodShop.getLocation() + ": " + orderValue + " PLN");

        System.out.println(order1 + "Order from " + glutenFreeShop.getName() +
                " " + glutenFreeShop.getLocation() + ": " + order1Value + " PLN");

        System.out.println(order2 + "Order from " + healthyShop.getName() +
                " " + healthyShop.getLocation() + ": " + order2Value + " PLN");

    }

    public Order getOrder() {
        return order;
    }

    public Customer getCustomer() {
        return customer;
    }

}