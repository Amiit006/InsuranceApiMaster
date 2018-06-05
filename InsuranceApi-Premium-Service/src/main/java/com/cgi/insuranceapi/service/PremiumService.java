package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Premium;

public interface PremiumService {

	List<Premium> getAllPremium() throws Exception;

	void save(Premium premium) throws Exception;

	Premium getPremiumById(int id) throws Exception;

	Premium getPremiumByPolicyId(int id) throws Exception;

	Premium updatePremium(int id, Premium premium) throws Exception;

	void deletePremium(int id) throws Exception;

}