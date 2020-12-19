/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author ADMIN
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity) {
        this.airplanes.put(id, new Airplane(id, capacity));
    }
    
    public void addFlight(Airplane plane, String departure, String target) {
        this.places.putIfAbsent(departure, new Place(departure));
        this.places.putIfAbsent(target, new Place(target));
        
        Flight flight = new Flight(plane, this.places.get(departure), this.places.get(target));
        
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }        
    
    public Airplane getAirplane(String ID){
        return this.airplanes.get(ID);
    }
}
