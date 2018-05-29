package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.model.Policy;
import com.cgi.insuranceapi.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	PolicyRepository policyRepo;

	@Override
	public List<Policy> getAllPolicy() {
		// TODO Auto-generated method stub
		List<Policy> policyList = policyRepo.findAll();
		if(policyList != null)
			return policyList;
		return null;
	}

	@Override
	public Policy getPolicyById(int id) {
		Policy policy = policyRepo.findById(id);
		if(policy != null)
			return policy;
		return null;
	}

	@Override
	public Policy getPolicyByPolicyNumber(String policyNumber) {
		Policy policy = policyRepo.findByPolicyNumber(policyNumber);
		if(policy != null)
			return policy;
		return null;
	}

	@Override
	public void save(Policy policy) {
		policyRepo.save(policy);
	}

	@Override
	public Policy updatePolicy(int id, Policy policy) {
		Policy p = policyRepo.findById(id) ;
		if(p != null) {
			p.setPolicyNumber(policy.getPolicyNumber());
			p.setInsuranceTypeId(policy.getInsuranceTypeId());
			p.setInsuredName(policy.getInsuredName());
			p.setUnderwriterId(policy.getUnderwriterId());
			p.setEffectiveDate(policy.getEffectiveDate());
			p.setExpiryDate(policy.getExpiryDate());
			p.setAmountInsured(policy.getAmountInsured());
			p.setIsActive(policy.getIsActive());
			p.setModifiedBy(policy.getModifiedBy());
			p.setModifiedDate();
			policyRepo.save(p);
			return p;
		}
		return null;
	}

	@Override
	public void deletePolicy(int policyId) {
		Policy p = policyRepo.findById(policyId) ;
		if(p != null) {
			policyRepo.deleteById(policyId);
		}
	}
	
	
}
