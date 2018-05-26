package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.model.Premium;
import com.cgi.insuranceapi.repository.PremiumRepository;

@Service
public class PremiumServiceImpl implements PremiumService {
	
	@Autowired
	PremiumRepository premiumRepo;
	
	
	/* (non-Javadoc)
	 * @see com.cgi.insuranceapi.service.PremiumService#getAllPremium()
	 */
	@Override
	public List<Premium> getAllPremium(){
		return premiumRepo.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.cgi.insuranceapi.service.PremiumService#save(com.cgi.insuranceapi.model.Premium)
	 */
	@Override
	public void save(Premium premium) {
		premiumRepo.save(premium);
	}
	
	

}
