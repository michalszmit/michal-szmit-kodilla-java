package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    public Calculator(final Display display) {
        this.display=display;
    }

    public double add (double a, double b) {
        double value = a + b;
        display.displayValue(value);
        return value;
    }

    public double sub (double a, double b) {
        double value = a - b;
        display.displayValue(value);
        return value;
    }

    public double mul (double a, double b) {
        double value = a * b;
        display.displayValue(value);
        return value;
    }

    public double div (double a, double b) {
        double value = a / b;
        display.displayValue(value);
        return value;
    }
}
