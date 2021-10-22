package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void getPeopleQuantity() {
        //Given
        World world = new World();
        world.addContinents(new Continent("Asia").addCountries(new Country("China", new BigDecimal("1400000000"))));
        world.addContinents(new Continent("Asia").addCountries(new Country("India", new BigDecimal("900000000"))));
        world.addContinents(new Continent("Europe").addCountries(new Country("Poland", new BigDecimal("40000000"))));
        world.addContinents(new Continent("Europe").addCountries(new Country("Germany", new BigDecimal("80000000"))));
        world.addContinents(new Continent("Australia").addCountries(new Country("Australia", new BigDecimal("1500000000"))));
        world.addContinents(new Continent("Africa").addCountries(new Country("Egypt", new BigDecimal("70000000"))));
        //When
        BigDecimal expectedPeople = new BigDecimal("2640000000");
        //Then
        assertEquals(expectedPeople, world.getPeopleQuantity());
        }
    }
