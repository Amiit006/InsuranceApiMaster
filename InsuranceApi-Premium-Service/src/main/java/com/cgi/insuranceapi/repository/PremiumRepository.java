package com.cgi.insuranceapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.insuranceapi.model.Premium;

public interface PremiumRepository extends JpaRepository<Premium, Integer>{

	Premium findById(int id);
	
	List<Premium> findByPolicyId(int id);
	
}
