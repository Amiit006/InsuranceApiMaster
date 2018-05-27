package com.cgi.insuranceapi.service;

import java.util.List;
import java.util.Optional;

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
//		return null;
	}
	
	
	@Override
	public InsuranceType getInsuranceTypeById(int id) {
		InsuranceType it = incTypeRepo.findById(id);
		if (it != null) {
			return it;
		}
		else 
			return null;
	}
	
	@Override
	public InsuranceType getInsuranceTypeByName(String name){
		InsuranceType i = incTypeRepo.findByInsuranceTypeName(name);
		if(i == null)
			return null;
		return i;
	}
	
	
	@Override
	public String saveInsuranceType(InsuranceType insuranceType){
		InsuranceType i = incTypeRepo.save(insuranceType);
		if(i != null)
			return "Item Created";
		else 
			return null;
	}
	
	
	@Override
	public String updateInsuranceType(int id, InsuranceType insuranceType){
		InsuranceType it = incTypeRepo.findById(id);
		
		if(it == null)
			return "No Item found.";
		else {
			it.setinsuranceTypeName(insuranceType.getinsuranceTypeName());
			it.setmodifiedBy(insuranceType.getmodifiedBy());
			it.setmodifiedDate();
			incTypeRepo.save(it);
			return "Item Updated";	
		}
		
		
	}
	
	
	@Override
	public String deleteInsuranceType(int id) {
		InsuranceType it = incTypeRepo.findById(id);
		if(it == null)
			return "No Item found.";
		else {
			incTypeRepo.deleteById(id);
			return "deleted";
		}
	}
	
}
