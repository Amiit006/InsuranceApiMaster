package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Policy;


public interface PolicyService {

	List<Policy> getAllPolicy();

	Policy getPolicyById(int id);
	
	Policy getPolicyByPolicyNumber(String policyNumber);

	void save(Policy policy);

	Policy updatePolicy(int id, Policy policy);

	void deletePolicy(int policyId);

}