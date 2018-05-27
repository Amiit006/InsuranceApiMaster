package com.cgi.insuranceapi.service;

import java.util.List;
import java.util.Optional;

import com.cgi.insuranceapi.model.InsuranceType;

public interface InsuranceTypeService {

	List<InsuranceType> getAllInsuranceType();

	InsuranceType getInsuranceTypeById(int id);

	InsuranceType getInsuranceTypeByName(String name);

	String saveInsuranceType(InsuranceType insuranceType);

	String updateInsuranceType(int id, InsuranceType insuranceType);

	String deleteInsuranceType(int id);

}