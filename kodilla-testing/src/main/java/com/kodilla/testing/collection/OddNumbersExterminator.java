package com.kodilla.testing.collection;
import java.lang.*;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        int evenValue;
        for (int n = 0; n < numbers.size(); n++) {
            evenValue = numbers.get(n);
            if (evenValue % 2 == 0) {
                System.out.println(evenValue);
            }
        }
        return numbers;
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
