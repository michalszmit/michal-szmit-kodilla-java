package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String name;
    private BigDecimal numberOfPeople;

    public Country(final String name, final BigDecimal numberOfPeople) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }
}
