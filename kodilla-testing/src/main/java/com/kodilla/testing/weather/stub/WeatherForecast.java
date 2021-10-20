package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private final Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverage() {
        Double total = 0.0;
        for (Double tempReadings : temperatures.getTemperatures().values()) {
            total += tempReadings;
        }
        return total / calculateForecast().size();
    }

    public double calculateMedian() {
        Collection<Double> readings = temperatures.getTemperatures().values();
        List<Double> tempValues = new ArrayList<>(readings);
        Collections.sort(tempValues);
        if (tempValues.size() % 2 == 1) {
            return tempValues.get(tempValues.size() / 2);
        } else {
            return (tempValues.get(tempValues.size() / 2) + tempValues.get(tempValues.size() / 2 - 1)) / 2;
        }
    }
}
