package com.cgi.insuranceapi.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cgi.insuranceapi.model.Claim;

@Transactional
public interface ClaimRepository extends JpaRepository<Claim, Integer>{

	Claim findById(int id);
	
	Claim findByPolicyId(int id);
	
	Claim findByClaimReference(String string);
}
