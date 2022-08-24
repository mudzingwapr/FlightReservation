package com.planetsofBrands.Repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.planetsofBrands.Entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
    @Query("From Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateofDeparture=:dateofDeparture")
	List<Flight> findFlightBy(@Param("departureCity") String from, @Param("arrivalCity")String to,@Param("dateofDeparture") Date dedate);

}
