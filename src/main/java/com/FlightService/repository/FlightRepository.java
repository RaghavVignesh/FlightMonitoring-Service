package com.FlightService.repository;

import com.FlightService.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FlightRepository extends JpaRepository<Flight, Integer> {
    // Add custom query methods here if needed
}