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
	public List<Premium> getAllPremium() throws Exception {
		List<Premium> premmiumList = premiumRepo.findAll();
		if (premmiumList.size() > 0) {
			return premmiumList;
		}
		return null;
	}

	@Override
	public Premium getPremiumById(int id) throws Exception{
		Premium p = premiumRepo.findById(id);
		if (p != null)
			return p;
		else
			return null;
	}

	@Override
	public List<Premium> getPremiumByPolicyId(int id) throws Exception{
		List<Premium> p = premiumRepo.findByPolicyId(id);
		if (p.size() > 0)
			return p;
		else
			return null; 
	}

	@Override
	public void save(Premium premium) {
		premiumRepo.save(premium);
	}

	@Override
	public Premium updatePremium(int id, Premium premium) throws Exception{
		Premium p = premiumRepo.findById(id);
		if (p != null) {
			p.setdueDate(premium.getdueDate());
			p.setminimumPayment(premium.getminimumPayment());
			p.setmodifiedBy(premium.getmodifiedBy());
			p.setpolicyId(premium.getpolicyId());
			p.setpremiumStatus(premium.getpremiumStatus());
			premiumRepo.save(p);
			return p;
		}
		return null;
	}

	@Override
	public void deletePremium(int id) throws Exception{
		Premium p = premiumRepo.findById(id);
		if(p != null)
			premiumRepo.deleteById(id);
	}

}
