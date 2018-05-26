package com.cgi.insuranceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.insuranceapi.model.Policy;
import com.cgi.insuranceapi.service.PolicyService;

@RestController
public class PolicyController {

	@Autowired
	PolicyService policyService;
	
	@GetMapping("/api/policy")
	public ResponseEntity<List<Policy>> getAllPolicy(){
		return new ResponseEntity<List<Policy>>(policyService.getAllPolicy(), HttpStatus.OK);
	}
}
