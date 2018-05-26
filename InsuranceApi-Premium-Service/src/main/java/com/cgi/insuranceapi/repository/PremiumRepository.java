package com.cgi.insuranceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.insuranceapi.model.Premium;

public interface PremiumRepository extends JpaRepository<Premium, String>{

}
