package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flights {

    private String departureAirport;
    private String arrivalAirport;

    public Flights(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public String toString() {
        return  departureAirport + "-" + arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(departureAirport, flights.departureAirport) && Objects.equals(arrivalAirport, flights.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport);
    }
}
