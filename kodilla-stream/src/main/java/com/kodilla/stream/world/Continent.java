package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    public String name;
    public List<Country> countries = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }
}
