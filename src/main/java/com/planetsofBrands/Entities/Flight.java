package com.planetsofBrands.Entities;

import java.sql.Timestamp;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
@Data
@Entity
public class Flight extends AbstractEntity {
	private String flightno;
	private String operatingAirline;
	private String departureCity;
	private String arrivalCity;
	private Date dateofDeparture;
	private Timestamp estimatedapartureTime;

}
