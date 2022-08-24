package com.planetsofBrands.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.planetsofBrands.Entities.Reservation;

@Component
public class PDFGenerator {
	public void generatePdfIternarary(Reservation rseversion, String pa) throws FileNotFoundException, DocumentException {
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(pa));
		doc.add(generateTable(rseversion));
		doc.open();
		doc.add(new PdfPTable(2));
		doc.close();
	}

	private PdfPTable generateTable(Reservation rseversion) {
		PdfPTable ptable= new PdfPTable(2);
		PdfPCell pcell;
		
		pcell=new PdfPCell(new Phrase("Flight Itinerary"));
		pcell.setColspan(2);
		ptable.addCell(pcell);

		pcell=new PdfPCell(new Phrase("Flight Details"));
		pcell.setColspan(2);
		ptable.addCell(pcell);
		
	     ptable.addCell("Departure City");
	     ptable.addCell(rseversion.getFlight().getDepartureCity());
	     
	     ptable.addCell("Destination City");
	     ptable.addCell(rseversion.getFlight().getArrivalCity());
	     
	     ptable.addCell("Flight Number");
	     ptable.addCell(rseversion.getFlight().getFlightno());
	     
	     ptable.addCell("Date Of departure:");
	     ptable.addCell(rseversion.getFlight().getDateofDeparture().toString());    
	     
	     pcell=new PdfPCell(new Phrase("Passenger Details"));
			pcell.setColspan(2);
			ptable.addCell(pcell);
			
			ptable.addCell("Passenger Name");
		    ptable.addCell(rseversion.getPassenger().getFirstName());
		     
		    ptable.addCell("Passenger LastName ");
		    ptable.addCell(rseversion.getPassenger().getLastName());
		     
		    ptable.addCell("Passenger email");
		    ptable.addCell(rseversion.getPassenger().getEmail());
		     
		    ptable.addCell("Passenger phoneNumber");
		    ptable.addCell(rseversion.getPassenger().getPhoneNumber());  
	       
			
		  return ptable;
	}

}
																																																																