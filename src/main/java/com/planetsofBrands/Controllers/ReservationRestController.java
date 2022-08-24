package com.planetsofBrands.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.planetsofBrands.Entities.Reservation;
import com.planetsofBrands.Repository.ResevationRepository;
import com.planetsofBrands.dto.UpdateReservation;

@RestController
public class ReservationRestController {
	@Autowired
private ResevationRepository resrep;

	@GetMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Integer id) {
		Reservation rs = resrep.findById(id).get();
		return rs;
		
	}
	@PatchMapping("/reservations")
	public Reservation UpdateReservation(UpdateReservation request) {
		Reservation res=resrep.findById(request.getId()).get();
		res.setCheckedIn(request.getCheckIn());
		res.setNumberofBags(request.getNumberOfBags());
		return resrep.save(res);
		
	}
	
	
}
