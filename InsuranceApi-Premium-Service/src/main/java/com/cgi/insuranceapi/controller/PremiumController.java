package com.cgi.insuranceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.insuranceapi.model.Premium;
import com.cgi.insuranceapi.service.PremiumService;

@RestController
public class PremiumController {

	@Autowired
	PremiumService premiumService;

	@GetMapping("/api/premium")
	public ResponseEntity<List<Premium>> getAllPremium() {
		return new ResponseEntity<List<Premium>>(premiumService.getAllPremium(), HttpStatus.OK);
	}

	@GetMapping("/api/premium/{id}")
	public ResponseEntity<Premium> getPremiumById(@PathVariable int id) {
		return new ResponseEntity<Premium>(premiumService.getPremiumById(id), HttpStatus.OK);
	}

	@GetMapping("/api/premium/policy/{id}")
	public ResponseEntity<Premium> getPremiumByPolicyId(@PathVariable int id) {
		return new ResponseEntity<Premium>(premiumService.getPremiumByPolicyId(id), HttpStatus.OK);
	}

	@PostMapping("/api/premium")
	public ResponseEntity<Premium> savePremium(@RequestBody Premium premium) {
		premiumService.save(premium);
		return new ResponseEntity<Premium>(premium, HttpStatus.OK);
	}

	@PutMapping("/api/premium/{id}")
	public ResponseEntity<Premium> updatePremium(@PathVariable int id, @RequestBody Premium premium) {
		premiumService.updatePremium(id, premium);
		return new ResponseEntity<Premium>(premium, HttpStatus.OK);
	}
	
	@DeleteMapping("/api/premium/{id}")
	public ResponseEntity<String> deletePremium(@PathVariable int id) {
		premiumService.deletePremium(id);
		return new ResponseEntity<String>("Delete", HttpStatus.OK);
	}
}
