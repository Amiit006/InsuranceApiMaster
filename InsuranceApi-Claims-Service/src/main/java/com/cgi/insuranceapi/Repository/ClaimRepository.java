package com.cgi.insuranceapi.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.insuranceapi.model.Claim;

@Transactional
public interface ClaimRepository extends JpaRepository<Claim, Integer>{

	Claim findById(int id);
	
	List<Claim> findByPolicyId(int id);
	
	Claim findByClaimReference(String string);
}
