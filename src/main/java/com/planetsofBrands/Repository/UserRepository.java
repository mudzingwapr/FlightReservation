package com.planetsofBrands.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetsofBrands.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
