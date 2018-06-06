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

		try {
			List<Claim> result = claimsService.getAllClaims();
			if (result == null) {
				return new ResponseEntity<List<Claim>>(HttpStatus.NO_CONTENT);
			} else
				return new ResponseEntity<List<Claim>>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Claim>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/api/claim/{id}")
	public ResponseEntity<Claim> getClaimById(@PathVariable int id) {
		try {
			Claim c = claimsService.getClaimById(id);
			if (c == null)
				return new ResponseEntity<Claim>(HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<Claim>(c, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Claim>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/api/claim/policy/{id}")
	public ResponseEntity<List<Claim>> getClaimByPolicyId(@PathVariable int id) {
		try {
			List<Claim> c = claimsService.getClaimByPolicyId(id);
			if (c == null)
				return new ResponseEntity<List<Claim>>(HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<List<Claim>>(c, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Claim>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/api/claim/claimref/{claimRef}")
	public ResponseEntity<Claim> getClaimByClaimRef(@PathVariable String claimRef) {
		try {
			Claim c = claimsService.getClaimByClaimRef(claimRef);
			if (c == null)
				return new ResponseEntity<Claim>(HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<Claim>(c, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Claim>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/api/claim")
	public ResponseEntity<String> saveClaim(@RequestBody Claim claim) {
		try {
//			Claim c = claimsService.getClaimById(claim.getId());
			Claim c = claimsService.getClaimByClaimRef(claim.getClaimReference());
			if(c == null) {
				claimsService.save(claim);
				return new ResponseEntity<String>("Saved successfully", HttpStatus.CREATED);	
			}
			return new ResponseEntity<String>("Conflict", HttpStatus.CONFLICT);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/api/claim/{id}")
	public ResponseEntity<Claim> updateClaim(@PathVariable int id, @RequestBody Claim claim) {
		try {
			Claim c = claimsService.getClaimById(id);
			if(claimsService.getClaimByClaimRef(claim.getClaimReference()) == null) {
				if(c != null)
				{
					c = claimsService.updateClaim(id, claim);
					return new ResponseEntity<Claim>(c, HttpStatus.OK);	
				}
				else
					return new ResponseEntity<Claim>(HttpStatus.NOT_FOUND);	
			}
			else
				return new ResponseEntity<Claim>(HttpStatus.CONFLICT);
			
		} catch (Exception e) {
			return new ResponseEntity<Claim>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/api/claim/{id}")
	public ResponseEntity<String> deleteClaim(@PathVariable int id) {
		try {
			Claim c = claimsService.getClaimById(id);
			if(c != null)
			{
				claimsService.deleteClaim(id);
				return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
			}
			else
				return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
