package com.cgi.insuranceapi.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Insurance",  uniqueConstraints = {
	    @UniqueConstraint(columnNames={"insuranceTypeName"})})
public class InsuranceType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String insuranceTypeName;
	private String createdBy;
	private LocalTime createdDate;
	private String modifiedBy;
	private LocalTime modifiedDate;
	

	public InsuranceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsuranceType(String insuranceTypeName, String createdBy, String modifiedBy) {
		super();
		this.insuranceTypeName = insuranceTypeName;
		this.createdBy = createdBy;
		setcreatedDate();
		this.modifiedBy = modifiedBy;
		setmodifiedDate();
	}

	public String getinsuranceTypeName() {
		return insuranceTypeName;
	}

	public void setinsuranceTypeName(String insuranceTypeName) {
		this.insuranceTypeName = insuranceTypeName;
	}

	public String getcreatedBy() {
		return createdBy;
	}

	public void setcreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalTime getcreatedDate() {
		return createdDate;
	}

	public void setcreatedDate() {
		//return new Timestamp(System.currentTimeMillis());
		this.createdDate = LocalTime.now();
	}

	public String getmodifiedBy() {
		return modifiedBy;
	}

	public void setmodifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalTime getmodifiedDate() {
		return modifiedDate;
	}

	public void setmodifiedDate() {
//		return new Timestamp(System.currentTimeMillis());
		this.modifiedDate = LocalTime.now();
	}

}
