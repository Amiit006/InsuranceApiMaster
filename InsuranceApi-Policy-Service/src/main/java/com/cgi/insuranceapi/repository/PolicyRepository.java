package com.cgi.insuranceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.insuranceapi.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

	Policy findById(int id);
	
	Policy findByPolicyNumber(String policyNumber);
	
}
