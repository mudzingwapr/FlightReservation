package com.planetsofBrands.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetsofBrands.Entities.Reservation;

public interface ResevationRepository extends JpaRepository<Reservation, Integer> {

}
