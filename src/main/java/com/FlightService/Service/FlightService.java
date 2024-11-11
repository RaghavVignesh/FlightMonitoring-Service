package com.FlightService.Service;

import com.FlightService.model.Flight;
import com.FlightService.repository.FlightRepository;

public class FlightService {

    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {}

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
