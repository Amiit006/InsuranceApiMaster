package com.cgi.insuranceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.insuranceapi.model.Underwriter;
import com.cgi.insuranceapi.service.UnderwriterService;

@RestController
public class UnderwriterController {

	@Autowired
	UnderwriterService uwService;
	
	@GetMapping("/api/uw")
	public ResponseEntity<List<Underwriter>> getAllUnderwritter(){
		List<Underwriter> result = uwService.getAllUnderwriter();
		return new ResponseEntity<List<Underwriter>>(result, HttpStatus.OK);
	}
}
