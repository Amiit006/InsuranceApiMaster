package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.Repository.ClaimRepository;
import com.cgi.insuranceapi.model.Claim;

@Service
public class ClaimServiceImpl implements ClaimService{

	@Autowired
	ClaimRepository claimRepo;
	
	
	@Override
	public List<Claim> getAllClaims(){
		return claimRepo.findAll();
	}
	
	@Override
	public Claim getClaimById(int id){
		Claim c = claimRepo.findById(id);
		
		if(c != null)
			return c;
		return null;
	}
	
	@Override
	public Claim getClaimByPolicyId(int id){
		Claim c = claimRepo.findByPolicyId(id);
		if(c != null)
			return c;
		return null;
	}
	
	@Override
	public Claim getClaimByClaimRef(String claimRef) {
		Claim c = claimRepo.findByClaimReference(claimRef);
		if(c != null)
			return c;
		return null;
	}
	
	@Override
	public void save(Claim claim) {
		claimRepo.save(claim);
	}

	@Override
	public Claim updateClaim(int id, Claim claim) {
		Claim c = claimRepo.findById(id);
		
		if(c!= null) {
			c.setPolicyId(claim.getPolicyId());
			c.setClaimStatus(claim.getClaimStatus());
			c.setApprovedDate(claim.getApprovedDate());
			c.setClaimDate(claim.getClaimDate());
			c.setClaimReference(claim.getClaimReference());
			claimRepo.save(c);
			return c;
		}
		else 
			return c;
	}
	
	@Override
	public void deleteClaim(int id) {
		Claim c = claimRepo.findById(id);
		if(c!= null)
			claimRepo.deleteById(id);
		
	}
	
}
