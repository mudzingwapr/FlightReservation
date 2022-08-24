package com.planetsofBrands.Service;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.DocumentException;
import com.planetsofBrands.Entities.Flight;
import com.planetsofBrands.Entities.Passenger;
import com.planetsofBrands.Entities.Reservation;
import com.planetsofBrands.Repository.FlightRepository;
import com.planetsofBrands.Repository.PassengerRepos;
import com.planetsofBrands.Repository.ResevationRepository;
import com.planetsofBrands.dto.ReservationRequest;
import com.planetsofBrands.util.EmailUtil;
import com.planetsofBrands.util.PDFGenerator;
@Service
public class ReservationServiceImple implements ReservationService {
	@Autowired
	private FlightRepository flightrepos;
	@Autowired
	private PassengerRepos passengerRepo;
	@Autowired
    private ResevationRepository reservRepos;
	@Autowired
	private PDFGenerator pdfgenerator;
	
	@Autowired
	private EmailUtil emailUtil;
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
	Integer flightid = request.getFlightid();
	Flight flight = flightrepos.findById(flightid).get();
	
	Passenger ps = new Passenger(); 
	ps.setFirstName(request.getFirstname());
	ps.setLastName(request.getLastName());
	ps.setEmail(request.getEmail());
	ps.setPhoneNumber(request.getPhoneNumber());
	Passenger psenger=passengerRepo.save(ps);
	
		
	Reservation rs = new Reservation();
	rs.setFlight(flight);
	rs.setCheckedIn(false);
	rs.setPassenger(psenger);
	Reservation savedreservation = reservRepos.save(rs);
    String filePath = "C:\\Users\\BabaD\\Documents\\ReservationReport\\reservation" +
	savedreservation.getId()+ ".pdf";
	try {
		pdfgenerator.generatePdfIternarary(savedreservation,filePath);
	} catch (FileNotFoundException e) {
			e.printStackTrace();
	} catch (DocumentException e) {
			e.printStackTrace();
	}
	emailUtil.sendItinerary(ps.getEmail(), filePath);
	return savedreservation;
	}
	
	

}
