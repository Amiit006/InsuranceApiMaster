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
	public List<Underwriter> getAllUnderwriter() throws Exception{
		List<Underwriter> result = uwRepo.findAll();
		if(result != null)
			return result;
		return null;
	}
	
	@Override
	public Underwriter getUnderwriterById(int id) throws Exception{
		Underwriter  result = uwRepo.findById(id);
		if(result != null)
			return result;
		return null;
	}
	
	@Override
	public Underwriter getUnderwriterByName(String name) throws Exception{
		Underwriter result = uwRepo.findByUnderwriterName(name);
		if(result != null)
			return result;
		return null;
	}
	
	@Override
	public Underwriter saveUnderwriter(Underwriter underwriter) throws Exception{
		Underwriter und = uwRepo.findByUnderwriterName(underwriter.getUnderwriterName());
		if(und != null)
			return null;
		else {
			uwRepo.save(underwriter);
			return underwriter;
		}
	}
	
	@Override
	public Underwriter updateUnderwriter(int id, Underwriter underwriter) throws Exception{
		Underwriter und = uwRepo.findById(id);
		if(und != null) {
			und.setUnderwriterName(underwriter.getUnderwriterName());
			und.setModifiedBy(underwriter.getModifiedBy());
			uwRepo.save(und);
			return und;
		}
		else 
			return null;
	}
	
	@Override
	public void deleteUnderwriter(int id) throws Exception{
		uwRepo.deleteById(id);
	}
}
