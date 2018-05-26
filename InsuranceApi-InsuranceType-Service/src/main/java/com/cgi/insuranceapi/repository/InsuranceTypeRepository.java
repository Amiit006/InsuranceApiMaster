package com.cgi.insuranceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cgi.insuranceapi.model.InsuranceType;

@Repository
public interface InsuranceTypeRepository extends JpaRepository<InsuranceType, String>{

	
	/*@Query("SELECT it FROM InsuranceType it where t.id = :id") 
    InsuranceType getInsuranceTypeById(@Param("id") Long id);*/
	
}
