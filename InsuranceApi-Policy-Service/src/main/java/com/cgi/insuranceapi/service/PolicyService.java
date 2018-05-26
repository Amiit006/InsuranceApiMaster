package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Policy;


public interface PolicyService {

	List<Policy> getAllPolicy();

	Policy getPolicyByPolicyName(String policyName);

	void save(Policy policy);

	void updatePolicyDetails(Policy policy);

	void deletePolicy(int policyId);

}