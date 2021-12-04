
package com.kodilla.exception.test.flight;

import java.util.HashMap;

public class FlightFinder {

    private final HashMap<String, Boolean> airports = new HashMap<>();

    public FlightFinder() {

        airports.put("Warszawa", true);
        airports.put("London", true);
        airports.put("Wroclaw", true);
        airports.put("New York", true);
        airports.put("Krakow", false);
        airports.put("Poznan", false);
    }

    public boolean findFlight(String airport) throws RouteNotFoundException {
        if(!airports.containsKey(airport)) {
            throw new RouteNotFoundException("Flight to " + airport + " does not exist in database");
        }
        return airports.get(airport);
    }

    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder flightFinder = new FlightFinder();

        System.out.println(flightFinder.findFlight("Warszawa"));
        System.out.println(flightFinder.findFlight("Tokyo"));
    }
}