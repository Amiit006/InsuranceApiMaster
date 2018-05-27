package com.cgi.insuranceapi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgi.insuranceapi.model.InsuranceType;

@Repository
//public interface InsuranceTypeRepository extends org.springframework.data.repository.Repository<InsuranceType, Integer>{
public interface InsuranceTypeRepository extends JpaRepository<InsuranceType, Integer>{
	InsuranceType findByInsuranceTypeName(String InsuranceTypeName); 
	
	InsuranceType findById(int id);
}
