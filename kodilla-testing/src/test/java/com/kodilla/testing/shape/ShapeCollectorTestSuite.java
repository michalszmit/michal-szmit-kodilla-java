package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

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

    @DisplayName("Testing figure adding method: ")
    @Test
    void addFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        //When
        String expected = "Circle";
        shapeCollector.addFigure(circle);
        //Then
        Assertions.assertEquals(expected, shapeCollector.getFigure(0).getShapeName());

    }

    @DisplayName("Testing figure removing method: ")
    @Test
     void removeFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        String expected = "[]";
        //Then
        Assertions.assertEquals(expected, shapeCollector.showFigures());

    }

    @DisplayName("Testing method that displays specific figure: ")
    @Test
    void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        shapeCollector.addFigure(circle);
        //When
        String expected = "Circle";
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assertions.assertEquals(expected, result.getShapeName());
    }

    @DisplayName("Testing method for showing all figures: ")
    @Nested
    class NestedTesting {
    @Test
    void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        shapeCollector.addFigure(circle);
        //When
        String expected = "[Circle{radius=10.0, field=314.0}]";
        String result = shapeCollector.showFigures();
        //Then
        Assertions.assertEquals(expected, result);
    }
    }
}
