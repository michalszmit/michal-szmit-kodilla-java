package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
            System.out.println(secondChallenge.probablyIWillThrowException(1, 1.5));
        }
            catch (Exception e){
                System.out.println("Wrong double - " + e);
            }
            finally {
                System.out.println("Methode finished");
            }
    }
}
