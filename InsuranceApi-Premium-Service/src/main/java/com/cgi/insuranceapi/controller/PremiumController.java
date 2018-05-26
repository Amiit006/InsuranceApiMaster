package com.cgi.insuranceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.insuranceapi.model.Premium;
import com.cgi.insuranceapi.service.PremiumService;

@RestController
public class PremiumController {

	@Autowired
	PremiumService premiumService;
	
	@GetMapping("/api/premium")
	public ResponseEntity<List<Premium>> getAllPremium(){
		return new ResponseEntity<List<Premium>>(premiumService.getAllPremium(),HttpStatus.OK);
	}
}
