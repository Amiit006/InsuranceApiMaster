package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.Repository.ClaimsRepository;
import com.cgi.insuranceapi.model.Claims;

@Service
public class ClaimsServiceImpl implements ClaimsService{

	@Autowired
	ClaimsRepository claimsRepository;
	
	
	@Override
	public List<Claims> getAllClaims(){
		return claimsRepository.findAll();
	}
	
	@Override
	public void save(Claims claim) {
		claimsRepository.save(claim);
	}
	
	@Override
	public Claims getClaimByClaimRef(String claimRef) {
//		return claimsRepository.getClaimRecordByClaimRef(claimRef);
		return null;
	}
}
