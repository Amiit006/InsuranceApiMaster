package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Claims;

public interface ClaimsService {

	List<Claims> getAllClaims();

	void save(Claims claim);

	Claims getClaimByClaimRef(String claimRef);

}