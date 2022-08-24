package com.planetsofBrands.Entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Reservation extends AbstractEntity {
	private Boolean CheckedIn;
	private Integer numberofBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;

}
