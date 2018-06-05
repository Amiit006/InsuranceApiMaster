package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Policy;


public interface PolicyService {

	List<Policy> getAllPolicy() throws Exception;

	Policy getPolicyById(int id) throws Exception;
	
	Policy getPolicyByPolicyNumber(String policyNumber) throws Exception;

	void save(Policy policy) throws Exception;

	Policy updatePolicy(int id, Policy policy) throws Exception;

	void deletePolicy(int policyId) throws Exception;

}