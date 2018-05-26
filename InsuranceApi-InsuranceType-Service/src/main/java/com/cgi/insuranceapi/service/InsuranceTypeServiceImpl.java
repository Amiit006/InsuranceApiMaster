package com.cgi.insuranceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.insuranceapi.model.InsuranceType;
import com.cgi.insuranceapi.repository.InsuranceTypeRepository;

@Service
public class InsuranceTypeServiceImpl implements InsuranceTypeService {

	@Autowired
	InsuranceTypeRepository incTypeRepo;
	
	
	@Override
	public List<InsuranceType> getAllInsuranceType(){
		return incTypeRepo.findAll();
	}
	
	
	@Override
	public InsuranceType getInsuranceTypeById(int id){
		return null;
	}
	
	
	@Override
	public InsuranceType getInsuranceTypeByName(String name){
		return null;
	}
	
	
	@Override
	public String saveInsuranceType(InsuranceType insuranceType){
		return "Item Created";
	}
	
	
	@Override
	public String updateInsuranceType(int id, InsuranceType insuranceType){
		return "Item Updated";
	}
	
	
	@Override
	public String deleteInsuranceType(int id) {
		return "deleted";
	}
	
}
