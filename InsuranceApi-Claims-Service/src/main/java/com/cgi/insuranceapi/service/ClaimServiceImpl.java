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
	public List<Claim> getAllClaims() throws Exception{
		List<Claim> result = claimRepo.findAll();
		if(result.size() > 0)
			return result;
		return null;
	}
	
	@Override
	public Claim getClaimById(int id) throws Exception{
		Claim c = claimRepo.findById(id);
		
		if(c != null)
			return c;
		return null;
	}
	
	@Override
	public List<Claim> getClaimByPolicyId(int id) throws Exception{
		List<Claim> c = claimRepo.findByPolicyId(id);
		if(c.size() > 0)
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
	public void save(Claim claim) throws Exception {
		claimRepo.save(claim);
	}

	@Override
	public Claim updateClaim(int id, Claim claim) throws Exception {
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
	public void deleteClaim(int id) throws Exception {
		Claim c = claimRepo.findById(id);
		if(c!= null)
			claimRepo.deleteById(id);
		
	}
	
}
