package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleOfWorld = continents.stream()
                .flatMap(continent -> continent.countries.stream())
                .map(Country::getNumberOfPeople)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleOfWorld;
    }
}
