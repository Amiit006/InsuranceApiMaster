package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Premium;

public interface PremiumService {

	List<Premium> getAllPremium();

	void save(Premium premium);

	Premium getPremiumById(int id);

	Premium getPremiumByPolicyId(int id);

	Premium updatePremium(int id, Premium premium);

	void deletePremium(int id);

}