package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.Repository.ClaimRepository;
import com.cgi.insuranceapi.model.Claim;

@Service
public class ClaimServiceImpl implements ClaimService{

	@Autowired
	ClaimRepository claimsRepository;
	
	
	@Override
	public List<Claim> getAllClaims(){
		return claimsRepository.findAll();
	}
	
	@Override
	public void save(Claim claim) {
		claimsRepository.save(claim);
	}
	
	@Override
	public Claim getClaimByClaimRef(String claimRef) {
//		return claimsRepository.getClaimRecordByClaimRef(claimRef);
		return null;
	}
}
