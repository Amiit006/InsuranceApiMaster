package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Claim;

public interface ClaimService {

	List<Claim> getAllClaims() throws Exception;

	void save(Claim claim) throws Exception;

	Claim getClaimByClaimRef(String claimRef) throws Exception;

	Claim getClaimById(int id) throws Exception;

	List<Claim> getClaimByPolicyId(int id) throws Exception;

	Claim updateClaim(int id, Claim claim) throws Exception;

	void deleteClaim(int id) throws Exception;

}