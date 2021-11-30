
package com.kodilla.exception.nullpointer;

import java.util.HashMap;

public class FlightFinder {

    private final HashMap<String, Boolean> airport = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {

        airport.put("Warszawa", true);
        airport.put("London", true);
        airport.put("Wroclaw", true);
        airport.put("New York", true);
        airport.put("Krakow", false);
        airport.put("Poznan", false);
    }

    public static void main(String[] args) {
    }
}