package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String name;
    public List<Country> countries = new ArrayList<>();

    public Continent(String name){
        this.name = name;
    }

    public Continent addCountries(Country country) {
        countries.add(country);
        return null;
    }
}
