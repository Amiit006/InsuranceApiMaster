package com.cgi.insuranceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.insuranceapi.model.Underwriter;

@Repository
public interface UnderwriterRepository extends JpaRepository<Underwriter, String>{

}
