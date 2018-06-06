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
		try {
			List<Policy> policyList = policyService.getAllPolicy();
			if(policyList.size() >0)
				return new ResponseEntity<List<Policy>>(policyList, HttpStatus.OK);
			else 
				return new ResponseEntity<List<Policy>>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<List<Policy>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/api/policy/{id}")
	public ResponseEntity<Policy> getPolicyById(@PathVariable int id){
		try {
			Policy p = policyService.getPolicyById(id);
			if(p != null)
				return new ResponseEntity<Policy>(p, HttpStatus.OK);
			else 
				return new ResponseEntity<Policy>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Policy>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/api/policy/name/{name}")
	public ResponseEntity<Policy> getPolicyByPolicyNumber(@PathVariable String name){
		try {
			Policy p = policyService.getPolicyByPolicyNumber(name);
			if(p != null)
				return new ResponseEntity<Policy>(p, HttpStatus.OK);
			else 
				return new ResponseEntity<Policy>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Policy>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/api/policy")
	public ResponseEntity<Policy> savePolicyByPolicyNumber(@RequestBody Policy policy){
		try {
			Policy p = policyService.getPolicyByPolicyNumber(policy.getPolicyNumber());
			if(p == null) {
				policyService.save(policy);
				return new ResponseEntity<Policy>(policy, HttpStatus.CREATED);	
			}
			else
				return new ResponseEntity<Policy>(HttpStatus.CONFLICT);
		} catch (Exception e) {
			return new ResponseEntity<Policy>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PutMapping("/api/policy/{id}")
	public ResponseEntity<Policy> updatePolicyByPolicyNumber(@PathVariable int id, @RequestBody Policy policy){
		try {
			Policy p = policyService.getPolicyById(id);
			if(p != null)
				return new ResponseEntity<Policy>(policyService.updatePolicy(id, policy), HttpStatus.OK);
			else
				return new ResponseEntity<Policy>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Policy>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/api/policy/{id}")
	public ResponseEntity<Policy> deletePolicyByPolicyNumber(@PathVariable int id){
		try {
			Policy p = policyService.getPolicyById(id);
			if(p != null)
			{
				policyService.deletePolicy(id);
				return new ResponseEntity<Policy>(HttpStatus.OK);
			}
				
			else
				return new ResponseEntity<Policy>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Policy>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
