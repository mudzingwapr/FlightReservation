package com.planetsofBrands.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.planetsofBrands.Entities.User;
import com.planetsofBrands.Repository.UserRepository;
@Controller
public class UserController {
	@Autowired
	private UserRepository repos;
	
	@GetMapping("/showReg")
	public String showreg() {
		return "login/login";
		
	}
	@PostMapping("/RegisterUser")
    public String register(@ModelAttribute User user) {
		repos.save(user);
    	return "login/Loging";
    }
	@PostMapping("/flight")
	public String findflight(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap mp) {
		User us=repos.findByEmail(email);
		if(us.getPassword().equals(password)) {
		return "Flight";
	} else 
		mp.addAttribute("msg", "Password or Username incorrect please try correct Credential");
	return "login/Loging";
	}
}
