package com.cgi.insuranceapi.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Insurance")
public class InsuranceType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String insuranceTypeName;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Timestamp modifiedDate;
	

	public InsuranceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsuranceType(String insuranceTypeName, String createdBy, String modifiedBy) {
		super();
		this.insuranceTypeName = insuranceTypeName;
		this.createdBy = createdBy;
		createdDate = setcreatedDate();
		this.modifiedBy = modifiedBy;
		modifiedDate = setmodifiedDate();
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

	public Timestamp getcreatedDate() {
		return createdDate;
	}

	public Timestamp setcreatedDate() {
		return new Timestamp(System.currentTimeMillis());
	}

	public String getmodifiedBy() {
		return modifiedBy;
	}

	public void setmodifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getmodifiedDate() {
		return modifiedDate;
	}

	public Timestamp setmodifiedDate() {
		return new Timestamp(System.currentTimeMillis());
	}

}
