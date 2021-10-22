package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;


public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0,20)
        .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        return result.getAsDouble();
    }
}
