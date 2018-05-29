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
	
	@GetMapping("/api/policy/{id}")
	public ResponseEntity<Policy> getPolicyById(@PathVariable int id){
		Policy p = policyService.getPolicyById(id);
		if(p != null)
			return new ResponseEntity<Policy>(p, HttpStatus.OK);
		else 
			return new ResponseEntity<Policy>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/api/policy/name/{name}")
	public ResponseEntity<Policy> getPolicyByPolicyNumber(@PathVariable String name){
		Policy p = policyService.getPolicyByPolicyNumber(name);
		if(p != null)
			return new ResponseEntity<Policy>(p, HttpStatus.OK);
		else 
			return new ResponseEntity<Policy>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/api/policy")
	public ResponseEntity<String> savePolicyByPolicyNumber(@RequestBody Policy policy){
		policyService.save(policy);
		return new ResponseEntity<String>("Created Policy", HttpStatus.CREATED);
	}
	
	@PutMapping("/api/policy/{id}")
	public ResponseEntity<Policy> updatePolicyByPolicyNumber(@PathVariable int id, @RequestBody Policy policy){
		Policy p = policyService.getPolicyById(id);
		if(p != null)
			return new ResponseEntity<Policy>(p, HttpStatus.OK);
		else
			return new ResponseEntity<Policy>(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/api/policy/{id}")
	public ResponseEntity<Policy> deletePolicyByPolicyNumber(@PathVariable int id){
		Policy p = policyService.getPolicyById(id);
		if(p != null)
		{
			policyService.deletePolicy(id);
			return new ResponseEntity<Policy>(p, HttpStatus.OK);
		}
			
		else
			return new ResponseEntity<Policy>(HttpStatus.NOT_FOUND);
	}
}
