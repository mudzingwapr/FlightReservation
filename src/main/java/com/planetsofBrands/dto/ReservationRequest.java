package com.planetsofBrands.dto;

import lombok.Data;

@Data
public class ReservationRequest {
	private Integer flightid;
	private String firstname;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String nameOnCard;
	private String cardnumber;
	private String expirationDate;
	private String securityCode;

}
