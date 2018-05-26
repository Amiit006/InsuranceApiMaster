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
		return null;
	}
}
