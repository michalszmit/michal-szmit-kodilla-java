package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("TDD: Weather Forecast Test Suite")
class WeatherForecastTestSuite {

    private static int testCounter;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Mock
    private Temperatures temperaturesMock;


    @Test
    void testCalculateForecastWithMock() {

        //Given

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperatureWithMock() {
        //Given

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double average = weatherForecast.calculateAverage();
        //Then
        Assertions.assertEquals(25.56, average, 0.01);
    }

    @Test
    void testMedianTemperatureWithMock() {
        //Given

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.calculateMedian();
        //Then
        Assertions.assertEquals(25.5, median);
    }
}
