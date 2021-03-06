package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String name;
    public List<Country> countries = new ArrayList<>();

    public Continent(final String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }
}
