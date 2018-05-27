package com.cgi.insuranceapi.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cgi.insuranceapi.model.Claim;

@Transactional
public interface ClaimRepository extends JpaRepository<Claim, String>{

	/*@Query("Select * from Claim")
	public List<Claims> getAllClaims();*/
	
	/*@Query(value = "Select c from Claim c where c.claim_reference = (?1)")
	public Claims getClaimRecordByClaimRef(String claimRef);*/
}
