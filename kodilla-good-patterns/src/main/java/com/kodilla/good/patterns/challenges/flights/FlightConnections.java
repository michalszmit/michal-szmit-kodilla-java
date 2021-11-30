package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightConnections {

    private final List<Flights> connections = new ArrayList<>();

    public FlightConnections() {
        connections.add(new Flights("Gdansk", "Berlin"));
        connections.add(new Flights("Gdansk", "Krakow"));
        connections.add(new Flights("Gdansk", "Warszawa"));
        connections.add(new Flights("Warszawa", "Tokyo"));
        connections.add(new Flights("Warszawa", "Moskwa"));
        connections.add(new Flights("Warszawa", "Szczecin"));
        connections.add(new Flights("Krakow", "Wroclaw"));
        connections.add(new Flights("Krakow", "Madryt"));
        connections.add(new Flights("Krakow", "Warszawa"));
    }

    public List<Flights> flightsFrom(String departureAirport) {
        return connections.stream()
                .filter(e -> e.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flights> flightsTo(String arrivalAirports) {
        return connections.stream()
                .filter(e -> e.getArrivalAirport().equals(arrivalAirports))
                .collect(Collectors.toList());
    }

    // Nie wiem jak wyszukać lot Gdansk - Wroclaw
/*    public List<Flights> transit(String departureAirports, String transitAirport, String arrivalAirports) {
        return connections.stream()
                .filter(e -> e.getArrivalAirport().equals(departureAirports))
                .collect(Collectors.toList());
    }*/

    public static void main(String[] args) {
        FlightConnections flightsFromAirport = new FlightConnections();
        List<Flights> fromAirport = flightsFromAirport.flightsFrom("Gdansk");
        System.out.println("All flights from Gdansk airport: " + "\n" + fromAirport);

        FlightConnections flightsToAirport = new FlightConnections();
        List<Flights> toAirport = flightsToAirport.flightsTo("Warszawa");
        System.out.println("\nAll flights to Warszawa airport: " + "\n" + toAirport);

/*        FlightConnections transitFlights = new FlightConnections();
        List<Flights> transitAirport = flightsToAirport.flightsTo("Warszawa");
        System.out.println("All flights Gdansk to Wroclaw airport: " + "\n" + transitAirport);*/

    }

}
