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

import com.cgi.insuranceapi.model.InsuranceType;
import com.cgi.insuranceapi.service.InsuranceTypeService;

@RestController
public class InsuranceTypeController {

	@Autowired
	InsuranceType incType;
	
	@Autowired
	InsuranceTypeService incTypeService;
	
	@GetMapping("/api/inctype")
	public ResponseEntity<List<InsuranceType>> getAllInsuranceType(){
		try {
			List<InsuranceType> result = incTypeService.getAllInsuranceType();
			if(result != null ) {
				return new ResponseEntity<List<InsuranceType>>(result, HttpStatus.OK);	
			}
			else
				return new ResponseEntity<List<InsuranceType>>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<List<InsuranceType>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/api/inctype/{incId}")
	public ResponseEntity<InsuranceType> getInsuranceTypeById(@PathVariable int incId){
		try {
			InsuranceType it = incTypeService.getInsuranceTypeById(incId);
			if(it != null)
				return new ResponseEntity<InsuranceType>(it, HttpStatus.OK);
			else
				return new ResponseEntity<InsuranceType>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<InsuranceType>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/api/inctype/incname/{incName}")
	public ResponseEntity<InsuranceType> getInsuranceTypeByName(@PathVariable String incName){
		try {
			InsuranceType it = incTypeService.getInsuranceTypeByName(incName);
			if(it != null)
				return new ResponseEntity<InsuranceType>(it, HttpStatus.OK);
			else
				return new ResponseEntity<InsuranceType>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<InsuranceType>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/api/inctype")
	public ResponseEntity<String> saveInsuranceType(@RequestBody InsuranceType insuranceType){
		try {
			InsuranceType it = incTypeService.getInsuranceTypeByName(insuranceType.getInsuranceTypeName());
			if(it == null) {
				return new ResponseEntity<String>(incTypeService.saveInsuranceType(insuranceType), HttpStatus.CREATED);	
			}
			else
				return new ResponseEntity<String>(HttpStatus.CONFLICT);
		}catch(Exception ex) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PutMapping("/api/inctype/{id}")
	public ResponseEntity<InsuranceType> updateInsuranceType(@PathVariable int id, @RequestBody InsuranceType insuranceType){
		try {
			InsuranceType it = incTypeService.getInsuranceTypeById(id);
			if(it != null) {
				return new ResponseEntity<InsuranceType>(incTypeService.updateInsuranceType(id, insuranceType), HttpStatus.OK);	
			}
			else {
				return new ResponseEntity<InsuranceType>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<InsuranceType>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@DeleteMapping("/api/inctype/{id}")
	public ResponseEntity<String> deleteInsuranceType(@PathVariable int id){
		try {
			InsuranceType it = incTypeService.getInsuranceTypeById(id);
			if(it != null) {
				return new ResponseEntity<String>(incTypeService.deleteInsuranceType(id), HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("Item Not found", HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
