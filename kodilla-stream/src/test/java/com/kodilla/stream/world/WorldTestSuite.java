package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void getPeopleQuantity() {
        //Given
        World world = new World();
        Continent europa = new Continent("Europa");
        Continent asia = new Continent ("Asia");
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country china = new Country("China", new BigDecimal("1400000000"));
        world.addContinents(europa);
        world.addContinents(asia);
        europa.addCountry(poland);
        asia.addCountry(china);
        //When
        BigDecimal expectedPeople = new BigDecimal("1440000000");
        //Then
        assertEquals(expectedPeople, world.getPeopleQuantity());
        }
    }
