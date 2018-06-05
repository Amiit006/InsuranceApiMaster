package com.cgi.insuranceapi.service;

import java.util.List;
import java.util.Optional;

import com.cgi.insuranceapi.model.InsuranceType;

public interface InsuranceTypeService {

	List<InsuranceType> getAllInsuranceType() throws Exception;

	InsuranceType getInsuranceTypeById(int id) throws Exception;

	InsuranceType getInsuranceTypeByName(String name) throws Exception;

	String saveInsuranceType(InsuranceType insuranceType) throws Exception;

	InsuranceType updateInsuranceType(int id, InsuranceType insuranceType) throws Exception;

	String deleteInsuranceType(int id) throws Exception;

}