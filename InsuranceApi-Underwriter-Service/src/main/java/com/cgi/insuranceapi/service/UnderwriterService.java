package com.cgi.insuranceapi.service;

import java.util.List;

import com.cgi.insuranceapi.model.Underwriter;

public interface UnderwriterService {

	List<Underwriter> getAllUnderwriter();

	Underwriter getUnderwriterById(int id);

	Underwriter deleteUnderwriter(int id);

	Underwriter updateUnderwriter(int id, Underwriter underwriter);

	Underwriter saveUnderwriter(Underwriter underwriter);

	Underwriter getUnderwriterByName(String name);
}