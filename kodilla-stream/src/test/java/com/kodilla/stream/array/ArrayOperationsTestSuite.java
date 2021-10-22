package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void getAverage() {

        //Given
        int[] numbers = {1,1,1,1,19,12,15,17,16,2,7,6,4,3,8,17,3,6,15,18};

        //When
        double actual = ArrayOperations.getAverage(numbers);
        double expected = 8.60;

        //Then
        assertEquals(expected, actual, 0.01);
    }
}
