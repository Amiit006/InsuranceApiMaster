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

import com.cgi.insuranceapi.model.Claim;
import com.cgi.insuranceapi.service.ClaimService;

@RestController
public class ClaimController {

	@Autowired
	ClaimService claimsService;

	@GetMapping("/api/claim")
	public ResponseEntity<List<Claim>> getAllClaims() {

		List<Claim> result = claimsService.getAllClaims();
		if (result == null) {
			return new ResponseEntity<List<Claim>>(HttpStatus.NO_CONTENT);
		} else
			return new ResponseEntity<List<Claim>>(result, HttpStatus.OK);
	}

	@GetMapping("/api/claim/{id}")
	public ResponseEntity<Claim> getClaimById(@PathVariable int id) {
		Claim c = claimsService.getClaimById(id);
		if (c != null)
			return new ResponseEntity<Claim>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Claim>(c, HttpStatus.OK);
	}

	@GetMapping("/api/claim/policy/{id}")
	public ResponseEntity<Claim> getClaimByPolicyId(@PathVariable int id) {
		Claim c = claimsService.getClaimByPolicyId(id);
		if (c != null)
			return new ResponseEntity<Claim>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Claim>(c, HttpStatus.FOUND);
	}

	@GetMapping("/api/claim/claimref/{claimRef}")
	public ResponseEntity<Claim> getClaimByClaimRef(@PathVariable String claimRef) {
		Claim c = claimsService.getClaimByClaimRef(claimRef);
		if (c != null)
			return new ResponseEntity<Claim>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<Claim>(c, HttpStatus.FOUND);
	}

	@PostMapping("/api/claim")
	public ResponseEntity<String> saveClaim(@RequestBody Claim claim) {
		claimsService.save(claim);
		return new ResponseEntity<String>("Saved successfully", HttpStatus.CREATED);
	}

	@PutMapping("/api/claim/{id}")
	public ResponseEntity<String> updateClaim(@PathVariable int id, @RequestBody Claim claim) {
		Claim c = claimsService.updateClaim(id, claim);
		return new ResponseEntity<String>("Saved successfully", HttpStatus.OK);
	}

	@DeleteMapping("/api/claim/{id}")
	public ResponseEntity<String> deleteClaim(@PathVariable int id) {
		claimsService.deleteClaim(id);
		return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
	}

}
