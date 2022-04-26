package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderService {

    public ProductOrderService() {
    }

    public OrderDto process(){

        OrderGenerator orderGenerator = new OrderGenerator();

        boolean isOrdered = orderGenerator.getOrder() != null;

        if(isOrdered){
            return new OrderDto(orderGenerator.getOrder(), isOrdered);
        }
        return null;
    }

    public static void main(String[] args) {

        OrderGenerator orderGenerator = new OrderGenerator();
        orderGenerator.createOrder();
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process();
    }
}