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
		return new ResponseEntity<List<InsuranceType>>(incTypeService.getAllInsuranceType(), HttpStatus.OK);
	}
	
	@GetMapping("/api/inctype/{incId}")
	public ResponseEntity<InsuranceType> getInsuranceTypeById(@PathVariable int incId){
		return new ResponseEntity<InsuranceType>(incTypeService.getInsuranceTypeById(incId), HttpStatus.OK);
	}
	
	@GetMapping("/api/inctype/{incName}")
	public ResponseEntity<InsuranceType> getInsuranceTypeByName(@PathVariable String incName){
		return new ResponseEntity<InsuranceType>(incTypeService.getInsuranceTypeByName(incName), HttpStatus.OK);
	}
	
	@PostMapping("/api/inctype")
	public ResponseEntity<String> saveInsuranceType(@RequestBody InsuranceType insuranceType){
		return new ResponseEntity<String>(incTypeService.saveInsuranceType(insuranceType), HttpStatus.CREATED);
	}
	@PutMapping("/api/inctype/{id}")
	public ResponseEntity<String> updateInsuranceType(@PathVariable int id, @RequestBody InsuranceType insuranceType){
		return new ResponseEntity<String>(incTypeService.updateInsuranceType(id, insuranceType), HttpStatus.OK);
	}
	@DeleteMapping("/api/inctype/{id}")
	public ResponseEntity<String> deleteInsuranceType(@PathVariable int id){
		return new ResponseEntity<String>(incTypeService.deleteInsuranceType(id), HttpStatus.OK);
	}
	
	
}
