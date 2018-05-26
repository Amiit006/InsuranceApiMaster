package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Premium;

public interface PremiumService {

	List<Premium> getAllPremium();

	void save(Premium premium);

}