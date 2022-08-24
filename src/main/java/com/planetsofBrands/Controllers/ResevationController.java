package com.planetsofBrands.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.planetsofBrands.Entities.Flight;
import com.planetsofBrands.Repository.FlightRepository;

@Controller
public class ResevationController {
	
	@Autowired
	public FlightRepository flightrepos;
	@GetMapping("/CompleteReseravation")
public String showCompleteResesarvation(@RequestParam("flightid") Integer id, ModelMap map) {
		Flight fl = flightrepos.findById(id).get();
		map.addAttribute("fl",fl);
	return "completeReservation";
}
}
