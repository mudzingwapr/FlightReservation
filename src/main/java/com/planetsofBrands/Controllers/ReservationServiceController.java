package com.planetsofBrands.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import com.planetsofBrands.Entities.Reservation;
import com.planetsofBrands.Service.ReservationService;
import com.planetsofBrands.dto.ReservationRequest;

@Controller
public class ReservationServiceController {
@Autowired
ReservationService service;
@PostMapping("/completeReservation")
public String ResservationComplete(ReservationRequest request,ModelMap mp) {
	Reservation res = service.bookFlight(request);
	mp.addAttribute("msg","Reservation successfully created with id "+res.getId());
	
	return "ReservationComplete";
}
}
