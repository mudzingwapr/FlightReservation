package com.planetsofBrands.Service;

import com.planetsofBrands.Entities.Reservation;
import com.planetsofBrands.dto.ReservationRequest;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);

}
