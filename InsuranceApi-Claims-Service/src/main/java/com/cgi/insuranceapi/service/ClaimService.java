package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Claim;

public interface ClaimService {

	List<Claim> getAllClaims();

	void save(Claim claim);

	Claim getClaimByClaimRef(String claimRef);

	Claim getClaimById(int id);

	Claim getClaimByPolicyId(int id);

	Claim updateClaim(int id, Claim claim);

	void deleteClaim(int id);

}