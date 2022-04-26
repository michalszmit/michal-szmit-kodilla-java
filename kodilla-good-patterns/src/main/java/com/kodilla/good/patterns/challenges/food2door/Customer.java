package com.kodilla.good.patterns.challenges.food2door;

public class Customer {

    private String firstname;
    private String lastname;
    private String email;

    public Customer(String name, String lastname, String email) {
        this.firstname = name;
        this.lastname = lastname;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname +
                ", email: " + email;
    }
}