package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;


@DisplayName ("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName ("when - create empty list" + " then - process empty list")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator emptyExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new LinkedList<>();
        //When
        List<Integer> result = emptyExterminator.exterminate(emptyList);
        List<Integer> expected = emptyList;
        //Then
        Assertions.assertEquals(expected, result );
    }

    @DisplayName ("when - creates list of numbers" + " then - processes the created list")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator fullExterminator = new OddNumbersExterminator();
        List<Integer> fullList = new LinkedList<>();
        fullList.add(77);
        fullList.add(12);
        fullList.add(24);
        fullList.add(93);
        fullList.add(45);
        fullList.add(22);
        fullList.add(1);
        fullList.add(2);
        //When
        List<Integer> result2 = fullExterminator.exterminate(fullList);
        List<Integer> expected2 = new LinkedList<>();
        expected2.add(12);
        expected2.add(24);
        expected2.add(22);
        expected2.add(2);
        //Then
        Assertions.assertEquals(expected2, result2);
    }
}
