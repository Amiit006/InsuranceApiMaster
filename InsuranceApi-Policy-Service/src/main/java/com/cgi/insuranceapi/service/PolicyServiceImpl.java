package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.model.Policy;
import com.cgi.insuranceapi.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	PolicyRepository policyRepository;
	
	
	@Override
	public List<Policy> getAllPolicy(){
		
		return policyRepository.findAll();
	}
	
	
	@Override
	public Policy getPolicyByPolicyName(String policyName) {
//		return policyRepository.findOne(policyName);
		return null;
	}
	
	
	@Override
	public void save(Policy policy) {
		policyRepository.save(policy);
	}
	
	
	@Override
	public void updatePolicyDetails(Policy policy) {
		policyRepository.save(policy);
	}
	
	
	@Override
	public void deletePolicy(int policyId) {
		policyRepository.deleteById("");
	}
}
