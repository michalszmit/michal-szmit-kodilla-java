package com.kodilla.testing.collection;

import java.lang.*;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List <Integer> evens = new LinkedList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evens.add(number);
            }
        }
        System.out.println(evens);
        return evens;
    }

    public static void main(String[] args) {
        List<Integer> createNumbers = new LinkedList<>();
        for (int n = 1; n < 10; n++) {
            createNumbers.add(n);
        }
        System.out.println("Table created: " + createNumbers);


        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(createNumbers);
    }
}
