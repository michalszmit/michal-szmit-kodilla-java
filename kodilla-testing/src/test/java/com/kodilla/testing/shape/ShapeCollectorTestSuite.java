package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD Shape Collector Test suite")
public class ShapeCollectorTestSuite {
    public static int testCount = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of the tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("Test complete.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCount++;
        System.out.println("Preparing to execute test # " + testCount);
    }

    @Test
    void addFigure() {
        //Given
        ShapeCollector newFigure = new ShapeCollector ();
        List<String> emptyCollection = new ArrayList<>();
        //When
        List<String> result = newFigure.addFigure("Circle");
        List<String> expected = emptyCollection;
        expected.add(0, "Circle");
        //Then
        Assertions.assertEquals(expected, result);
    }
    @Test
     void removeFigure() {
        //Given
        ShapeCollector newList = new ShapeCollector();
        List<String> circleList = new ArrayList<>();
        circleList.add(0, "Circle");
        //When
        List<String> result = newList.removeFigure("Circle");
        List<String> expected = new ArrayList<>();
        //Then
        Assertions.assertEquals(expected, result);
    }
    @Test
    void getFigure() {
        //Given
        ShapeCollector newList = new ShapeCollector();
        List<String> circleList = new ArrayList<>();
        circleList.add(0, "Circle");
        //When
        int result = newList.getFigure(circleList, 0);
        String expected = "Circle";
        //Then
        Assertions.assertEquals(expected, result);
    }
    @Test
    void showFigures() {
        //Given
        ShapeCollector newList = new ShapeCollector();
        List<String> fullList = new ArrayList<>();
        fullList.add(0, "Circle");
        fullList.add(1, "Square");
        fullList.add(2, "Triangle");
        //When
        String result = newList.showFigures(fullList);
        String expected = "Circle" + "Square" + "Triangle";
        //Then
        Assertions.assertEquals(expected, result);
    }
}
