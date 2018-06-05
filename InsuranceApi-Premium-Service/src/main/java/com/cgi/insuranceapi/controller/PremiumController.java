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
		try {
			List<Premium> premiumList = premiumService.getAllPremium();
			if (premiumList != null)
				return new ResponseEntity<List<Premium>>(premiumList, HttpStatus.OK);
			else
				return new ResponseEntity<List<Premium>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<List<Premium>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/api/premium/{id}")
	public ResponseEntity<Premium> getPremiumById(@PathVariable int id) {
		try {
			Premium p = premiumService.getPremiumById(id);
			if (p != null)
				return new ResponseEntity<Premium>(p, HttpStatus.OK);
			else
				return new ResponseEntity<Premium>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Premium>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/api/premium/policy/{id}")
	public ResponseEntity<Premium> getPremiumByPolicyId(@PathVariable int id) {
		try {
			Premium p = premiumService.getPremiumByPolicyId(id);
			if (p != null)
				return new ResponseEntity<Premium>(p, HttpStatus.OK);
			else
				return new ResponseEntity<Premium>(HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			return new ResponseEntity<Premium>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/api/premium")
	public ResponseEntity<Premium> savePremium(@RequestBody Premium premium) {
		try {
			premiumService.save(premium);
			return new ResponseEntity<Premium>(premium, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Premium>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/api/premium/{id}")
	public ResponseEntity<Premium> updatePremium(@PathVariable int id, @RequestBody Premium premium) {
		try {
			Premium p = premiumService.getPremiumById(id);
			if (p != null) {
				premiumService.updatePremium(id, premium);
				return new ResponseEntity<Premium>(premium, HttpStatus.OK);
			} else
				return new ResponseEntity<Premium>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Premium>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/api/premium/{id}")
	public ResponseEntity<String> deletePremium(@PathVariable int id) {
		try {
			Premium p = premiumService.getPremiumById(id);
			if (p != null) {
				premiumService.deletePremium(id);
				return new ResponseEntity<String>(HttpStatus.OK);
			}
			else
				return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
