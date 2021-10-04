package com.kodilla;

public class Calculator {
    public double addAToB (double a, double b) {
        return a + b;
    }
    public double deductAFromB (double a, double b) {
        return a - b;
    }
}

class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double addingResult = calculator.addAToB(70, 5.5);
        double deductingResult = calculator.deductAFromB(45, 15.55);

        System.out.println(addingResult);
        System.out.println(deductingResult);
    }
}