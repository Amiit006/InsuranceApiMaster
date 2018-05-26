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

import com.cgi.insuranceapi.model.Claims;
import com.cgi.insuranceapi.service.ClaimsService;

@RestController
public class ClaimsController {

	@Autowired
	ClaimsService claimsService;
	
	@GetMapping("/api/Claims")
	public ResponseEntity<List<Claims>> getAllClaims(){
		
		List<Claims> result = claimsService.getAllClaims();
		if(result == null) {
			return new ResponseEntity<List<Claims>>(HttpStatus.NO_CONTENT);
		}
		else 
			return new ResponseEntity<List<Claims>>(result, HttpStatus.OK);  
	}
	
	@PostMapping("/api/Claims")
	public ResponseEntity<String> saveClaims(@RequestBody Claims claim){
		
		claimsService.save(claim);
		return new ResponseEntity<String>("Saved successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/api/Claims/{claimRef}")
	public ResponseEntity<Claims> getClaimByClaimRef(@PathVariable String claimRef)
	{
		return new ResponseEntity<Claims>(claimsService.getClaimByClaimRef(claimRef), HttpStatus.FOUND);
	}
	
}
