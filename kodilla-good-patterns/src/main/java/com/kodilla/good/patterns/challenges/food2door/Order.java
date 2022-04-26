package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private Customer customer;
    private Producers product;
    private final int amount;

    public Order(Customer customer, Producers product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Producers getProduct() {
        return product;
    }

    public void setProduct(Producers product) {

        this.product = product;
    }

    public int getAmount() { return amount; }

    @Override
    public String toString() {
        return '\n' + "Order placed: " + '\n' +
                "User: " + customer + '\n' +
                "Selected products: " + product +
                " number of pieces: " + amount + " PCS" + '\n';
    }
}