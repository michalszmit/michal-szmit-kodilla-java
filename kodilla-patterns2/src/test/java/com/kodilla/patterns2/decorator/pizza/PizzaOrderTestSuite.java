package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithAllAdditionsCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargeSizeDecorator(theOrder);
        theOrder = new OnionsDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(65), theCost);
    }

    @Test
    public void testPizzaWithAllAdditionsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargeSizeDecorator(theOrder);
        theOrder = new OnionsDecorator(theOrder);
        theOrder = new JalapenoDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your pizza: Small + cheese + mushrooms + Large Size + onions + spicy jalapeno peppers + ham + double cheese + chicken bits ", description);
    }
}
