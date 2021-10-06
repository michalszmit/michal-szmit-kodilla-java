package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if (result.equals("theForumUser") ) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error");
        }
        // Kolejny test
        System.out.println("Test - pierwszy test jednostkowy:");
        //...

        Calculator calculator = new Calculator();
        int adding = calculator.addAtoB(40, 15);
        int subtracting = calculator.subtractAFromB(40, 15);
        int aaa = 55;
        int bbb = 25;

        if (adding == (aaa)) {
            System.out.println("adding test OK");
        }
        else {
            System.out.println("Error");
        }
        if (subtracting == (bbb)) {
            System.out.println("subtracting test OK");
        }
        else {
            System.out.println("Error");
        }
        System.out.println("calculator test complete");
    }
}
