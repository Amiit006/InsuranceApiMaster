package com.cgi.insuranceapi.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "InsuranceType")
public class InsuranceType {

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	private String InsuranceTypeName;
	private String CreatedBy;
	private Timestamp CreatedDate;
	private String ModifiedBy;
	private Timestamp ModifiedDate;

	public InsuranceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsuranceType(String insuranceTypeName, String createdBy, String modifiedBy) {
		super();
		InsuranceTypeName = insuranceTypeName;
		CreatedBy = createdBy;
		CreatedDate = setCreatedDate();
		ModifiedBy = modifiedBy;
		ModifiedDate = setModifiedDate();
	}

	public String getInsuranceTypeName() {
		return InsuranceTypeName;
	}

	public void setInsuranceTypeName(String insuranceTypeName) {
		InsuranceTypeName = insuranceTypeName;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return CreatedDate;
	}

	public Timestamp setCreatedDate() {
		return new Timestamp(System.currentTimeMillis());
	}

	public String getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDate() {
		return ModifiedDate;
	}

	public Timestamp setModifiedDate() {
		return new Timestamp(System.currentTimeMillis());
	}

}
