package com.planetsofBrands.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetsofBrands.Entities.Passenger;

public interface PassengerRepos extends JpaRepository<Passenger, Integer> {

}
