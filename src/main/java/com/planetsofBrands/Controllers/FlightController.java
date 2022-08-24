package com.planetsofBrands.Controllers;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.planetsofBrands.Entities.Flight;
import com.planetsofBrands.Repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	private FlightRepository flightrepos;
	@PostMapping("/findflight")
	public String findflight(@RequestParam("from") String from, @RequestParam("to") String to,@RequestParam("dedate")
	@DateTimeFormat(pattern="yyyy-MM-dd")  Date dedate, ModelMap mp) {
	List<Flight> fght= flightrepos.findFlightBy(from,to,dedate);
	mp.addAttribute("flights", fght);
		return "Availableflight";
	}
	@PostMapping("/createFlight")
	public Flight CreateFlight(@RequestBody Flight ft) {
		return flightrepos.save(ft);
	}

}
