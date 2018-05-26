package com.cgi.insuranceapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cgi.insuranceapi.model.Claims;

@Repository
public interface ClaimsRepository extends JpaRepository<Claims, String>{

	/*@Query("Select * from Claim")
	public List<Claims> getAllClaims();*/
	
	/*@Query(value = "Select c from Claim c where c.claim_reference = (?1)")
	public Claims getClaimRecordByClaimRef(String claimRef);*/
}
