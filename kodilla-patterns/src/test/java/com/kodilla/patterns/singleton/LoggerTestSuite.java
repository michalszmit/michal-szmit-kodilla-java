package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog() {
        //Given
//        Logger logger = new Logger();     // original code fragment before changing the Logger Class to enum
        logger = Logger.INSTANCE;           // added after changing the Logger class to enum
        //When
        logger.log("First log");
        logger.log("Captain's Log, Stardate 41153");
        String result = Logger.INSTANCE.getLastLog();
        //Then
        Assertions.assertEquals("Captain's Log, Stardate 41153", result);
    }

}
