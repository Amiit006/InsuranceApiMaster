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
	public ResponseEntity<List<Underwriter>> getAllUnderwriter() {
		try {
			List<Underwriter> result = uwService.getAllUnderwriter();
			if (result != null)
				return new ResponseEntity<List<Underwriter>>(result, HttpStatus.OK);
			else
				return new ResponseEntity<List<Underwriter>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<List<Underwriter>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/api/uw/{id}")
	public ResponseEntity<Underwriter> getUnderwriterById(@PathVariable int id) {
		try {
			Underwriter result = uwService.getUnderwriterById(id);
			if (result != null)
				return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
			else
				return new ResponseEntity<Underwriter>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Underwriter>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/api/uw/undname/{name}")
	public ResponseEntity<Underwriter> getUnderwriterByName(@PathVariable String name) {
		try {
			Underwriter result = uwService.getUnderwriterByName(name);
			if (result != null)
				return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
			else
				return new ResponseEntity<Underwriter>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Underwriter>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/api/uw")
	public ResponseEntity<Underwriter> saveUnderwriter(@RequestBody Underwriter undwriter) {
		try {
			Underwriter result = uwService.saveUnderwriter(undwriter);
			if (result != null)
				return new ResponseEntity<Underwriter>(result, HttpStatus.OK);
			else
				return new ResponseEntity<Underwriter>(HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<Underwriter>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/api/uw/{id}")
	public ResponseEntity<Underwriter> updateUnderwriter(@PathVariable int id, @RequestBody Underwriter undwriter) {
		try {
			Underwriter result = uwService.getUnderwriterById(id);
			if(result != null) {
				return new ResponseEntity<Underwriter>(uwService.updateUnderwriter(id, undwriter), HttpStatus.OK);
			}	
			else
				return new ResponseEntity<Underwriter>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Underwriter>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/api/uw/{id}")
	public ResponseEntity<Underwriter> deleteUnderwriter(@PathVariable int id) {
		try {
			Underwriter result = uwService.getUnderwriterById(id);
			if(result != null) {
				uwService.deleteUnderwriter(id);
				return new ResponseEntity<Underwriter>(HttpStatus.OK);
			}
			else
				return new ResponseEntity<Underwriter>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Underwriter>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
