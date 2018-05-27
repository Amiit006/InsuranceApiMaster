package com.cgi.insuranceapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.insuranceapi.model.Underwriter;
import com.cgi.insuranceapi.service.UnderwriterService;

@RestController
public class UnderwriterController {

	@Autowired
	UnderwriterService uwService;
	
	@GetMapping("/api/uw")
	public ResponseEntity<List<Underwriter>> getAllUnderwriter(){
		List<Underwriter> result = uwService.getAllUnderwriter();
		return new ResponseEntity<List<Underwriter>>(result, HttpStatus.OK);
	}
	
	@GetMapping("/api/uw/{id}")
	public ResponseEntity<Underwriter> getUnderwriterById(@PathVariable int id){
		Underwriter result = uwService.getUnderwriterById(id);
		return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
	}
	
	@GetMapping("/api/uw/undname/{name}")
	public ResponseEntity<Underwriter> getUnderwriterByName(@PathVariable String name){
		Underwriter result = uwService.getUnderwriterByName(name);
		return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
	}
	
	@PostMapping("/api/uw")
	public ResponseEntity<Underwriter> saveUnderwriter(@RequestBody Underwriter undwriter){
		Underwriter result = uwService.saveUnderwriter(undwriter);
		return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
	}
	
	@PutMapping("/api/uw/{id}")
	public ResponseEntity<Underwriter> updateUnderwriter(@PathVariable int id, 
			@RequestBody Underwriter undwriter){
		Underwriter result = uwService.updateUnderwriter(id , undwriter);
		return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
	}
	
	@DeleteMapping("/api/uw/{id}")
	public ResponseEntity<Underwriter> deleteUnderwriter(@PathVariable int id){
		Underwriter result = uwService.deleteUnderwriter(id);
		return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
	}
	
}
