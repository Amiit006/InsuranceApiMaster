package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.model.Underwriter;
import com.cgi.insuranceapi.repository.UnderwriterRepository;

@Service
public class UnderwriterServiceImpl implements UnderwriterService {

	@Autowired
	UnderwriterRepository uwRepo;

	@Override
	public List<Underwriter> getAllUnderwriter() {
//		return uwRepo.findAll();
		List<Underwriter> result = uwRepo.findAll();
		if(result != null)
			return result;
		return null;
	}
	
	@Override
	public Underwriter getUnderwriterById(int id) {
		Underwriter  result = uwRepo.findById(id);
		if(result != null)
			return result;
		return null;
	}
	
	@Override
	public Underwriter getUnderwriterByName(String name) {
		Underwriter result = uwRepo.findByUnderwriterName(name);
		if(result != null)
			return result;
		return null;
	}
	
	@Override
	public Underwriter saveUnderwriter(Underwriter underwriter) {
		Underwriter und = uwRepo.findByUnderwriterName(underwriter.getunderwriterName());
		if(und != null)
			return null;
		else {
			uwRepo.save(underwriter);
			return underwriter;
		}
	}
	
	@Override
	public Underwriter updateUnderwriter(int id, Underwriter underwriter) {
		Underwriter und = uwRepo.findById(id);
		if(und != null) {
			und.setunderwriterName(underwriter.getunderwriterName());
			und.setmodifiedBy(underwriter.getmodifiedBy());
			und.setmodifiedDate();
			uwRepo.save(und);
			return und;
		}
		else 
			return null;
	}
	
	@Override
	public Underwriter deleteUnderwriter(int id) {
		Underwriter und = uwRepo.findById(id);
		if(und != null) {
			uwRepo.deleteById(id);
			return und;
		}
		else 
			return null;
	}
}
