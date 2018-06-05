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
	public List<InsuranceType> getAllInsuranceType() throws Exception{
		return incTypeRepo.findAll();
	}
	
	
	@Override
	public InsuranceType getInsuranceTypeById(int id) throws Exception {
		InsuranceType it = incTypeRepo.findById(id);
		if (it != null) {
			return it;
		}
		else 
			return null;
	}
	
	@Override
	public InsuranceType getInsuranceTypeByName(String name) throws Exception{
		InsuranceType i = incTypeRepo.findByInsuranceTypeName(name);
		if(i == null)
			return null;
		return i;
	}
	
	
	@Override
	public String saveInsuranceType(InsuranceType insuranceType) throws Exception{
		InsuranceType i = incTypeRepo.save(insuranceType);
		if(i != null)
			return "Item Created";
		else 
			return null;
	}
	
	
	@Override
	public InsuranceType updateInsuranceType(int id, InsuranceType insuranceType) throws Exception{
		InsuranceType it = incTypeRepo.findById(id);
		
		if(it == null)
			return null;
		else {
			it.setInsuranceTypeName(insuranceType.getInsuranceTypeName());
			it.setModifiedBy(insuranceType.getModifiedBy());
			incTypeRepo.save(it);
			return insuranceType;	
		}
	}
	
	
	@Override
	public String deleteInsuranceType(int id) throws Exception{
		InsuranceType it = incTypeRepo.findById(id);
		if(it == null)
			return "No Item found.";
		else {
			incTypeRepo.deleteById(id);
			return "deleted";
		}
	}
	
}
