package com.planetsofBrands.Entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity

public class User extends AbstractEntity {
	private String firstName;
	private String lastname;
	private String email;
	private String password;

}
