package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdding() {
        //Given
        double a = 12.5;
        double b = 5.6;
        //When
        double result = calculator.add(a, b);
        //Then
        Assertions.assertEquals(18.1, result, 0.01 );
    }

    @Test
    public void testSubtracting() {
        //Given
        double a = 12.5;
        double b = 5.6;
        //When
        double result = calculator.sub(a, b);
        //Then
        Assertions.assertEquals(6.9, result, 0.01 );
    }

    @Test
    public void testMultiplying() {
        //Given
        double a = 3.3;
        double b = 3.0;
        //When
        double result = calculator.mul(a, b);
        //Then
        Assertions.assertEquals(9.9, result, 0.01 );
    }

    @Test
    public void testDividing() {
        //Given
        double a = 3.3;
        double b = 3.0;
        //When
        double result = calculator.div(a, b);
        //Then
        Assertions.assertEquals(1.1, result, 0.01 );
    }

}
