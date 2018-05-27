package com.cgi.insuranceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.insuranceapi.model.Claim;
import com.cgi.insuranceapi.service.ClaimService;

@RestController
public class ClaimController {

	@Autowired
	ClaimService claimsService;
	
	@GetMapping("/api/claim")
	public ResponseEntity<List<Claim>> getAllClaims(){
		
		List<Claim> result = claimsService.getAllClaims();
		if(result == null) {
			return new ResponseEntity<List<Claim>>(HttpStatus.NO_CONTENT);
		}
		else 
			return new ResponseEntity<List<Claim>>(result, HttpStatus.OK);  
	}
	
	@GetMapping("/api/claim/{claimRef}")
	public ResponseEntity<Claim> getClaimByClaimRef(@PathVariable String claimRef)
	{
		return new ResponseEntity<Claim>(claimsService.getClaimByClaimRef(claimRef), HttpStatus.FOUND);
	}
	
	@PostMapping("/api/claim")
	public ResponseEntity<String> saveClaims(@RequestBody Claim claim){
		
		claimsService.save(claim);
		return new ResponseEntity<String>("Saved successfully", HttpStatus.CREATED);
	}
	
	
	
}
