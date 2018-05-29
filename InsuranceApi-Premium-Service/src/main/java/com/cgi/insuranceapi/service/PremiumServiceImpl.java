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

	@Override
	public List<Premium> getAllPremium() {
		return premiumRepo.findAll();
	}

	@Override
	public Premium getPremiumById(int id) {
		return premiumRepo.findById(id);
	}

	@Override
	public Premium getPremiumByPolicyId(int id) {
		return premiumRepo.findByPolicyId(id);
	}

	@Override
	public void save(Premium premium) {
		premiumRepo.save(premium);
	}

	@Override
	public Premium updatePremium(int id, Premium premium) {
		Premium p = premiumRepo.findById(id);
		if(p != null ) {
			p.setdueDate();
			p.setminimumPayment(premium.getminimumPayment());
			p.setmodifiedBy(premium.getmodifiedBy());
			p.setmodifiedDate();
			p.setpolicyId(premium.getpolicyId());
			p.setpremiumStatus(premium.getpremiumStatus());
			premiumRepo.save(p);
			return p;
		}
		return null;
	}

	@Override
	public void deletePremium(int id) {
		premiumRepo.deleteById(id);
	}

}
