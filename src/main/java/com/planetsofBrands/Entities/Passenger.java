package com.planetsofBrands.Entities;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Passenger extends AbstractEntity {
	private String firstName;
	private String lastName;
	@JsonIgnore
	private String middlename;
	private String email;
	private String phoneNumber;

}
