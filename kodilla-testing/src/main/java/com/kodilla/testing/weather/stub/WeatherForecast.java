package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

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
        double average = 0.0;
        for (Double abc : calculateForecast().values()) {
            total += abc;
            average = total / calculateForecast().size();
        }
        return average;
    }

    public double calculateMedian() {
        double median=0.0;
        Collection readings = calculateForecast().values();
        List tempValues = new ArrayList<>(readings);
        Arrays.sort(new List[]{tempValues});
        if (tempValues.size()%2 == 1) {
            median = (double) tempValues.get(tempValues.size() / 2);
        }
        else {
           // median = (tempValues.get(tempValues.size()/2) + tempValues.get(tempValues.size()/2 - 1))/2;
        }
            return median;
        }
    }