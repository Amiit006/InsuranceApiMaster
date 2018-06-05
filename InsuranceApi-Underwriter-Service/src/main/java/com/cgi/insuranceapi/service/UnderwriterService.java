package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Underwriter;

public interface UnderwriterService {

	List<Underwriter> getAllUnderwriter() throws Exception;

	Underwriter getUnderwriterById(int id) throws Exception;

	void deleteUnderwriter(int id) throws Exception;

	Underwriter updateUnderwriter(int id, Underwriter underwriter) throws Exception;

	Underwriter saveUnderwriter(Underwriter underwriter) throws Exception;

	Underwriter getUnderwriterByName(String name) throws Exception;
}