package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .sauce("Hot")
                .burgers(2)
                .ingredient("Tomato")
                .ingredient("Pickle")
                .ingredient("Egg")
                .ingredient("Fried onions")
                .build();
        System.out.println(bigmac);

        //When
        int numberOfIngredients = bigmac.getIngredients().size();
        int numberOfBurgers = bigmac.getBurgers();

        //Then
        assertEquals(4, numberOfIngredients);
        assertEquals(2, numberOfBurgers);
    }
}