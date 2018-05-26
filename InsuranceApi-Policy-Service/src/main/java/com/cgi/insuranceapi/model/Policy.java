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
@Table(name = "policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String PolicyNumber;
	private int InsuranceTypeId;
	private String InsuredName;
	private int UnderwriterId;
	private Timestamp EffectiveDate;
	private Timestamp ExpiryDate;
	private float AmountInsured;
	private boolean IsActive;
	private String CreatedBy;
	private Timestamp CreatedDate;
	private String ModifiedBy;
	private Timestamp ModifiedDate;

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(String policyNumber, int insuranceTypeId, String insuredName, int underwriterId,
			float amountInsured, boolean isActive, String createdBy,
			String modifiedBy) {
		super();
		PolicyNumber = policyNumber;
		InsuranceTypeId = insuranceTypeId;
		InsuredName = insuredName;
		UnderwriterId = underwriterId;
		EffectiveDate = setEffectiveDate();
		ExpiryDate = setExpiryDate();
		AmountInsured = amountInsured;
		IsActive = isActive;
		CreatedBy = createdBy;
		CreatedDate = setCreatedDate();
		ModifiedBy = modifiedBy;
		ModifiedDate = setModifiedDate();
	}

	public String getPolicyNumber() {
		return PolicyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}

	public int getInsuranceTypeId() {
		return InsuranceTypeId;
	}

	public void setInsuranceTypeId(int insuranceTypeId) {
		InsuranceTypeId = insuranceTypeId;
	}

	public String getInsuredName() {
		return InsuredName;
	}

	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}

	public int getUnderwriterId() {
		return UnderwriterId;
	}

	public void setUnderwriterId(int underwriterId) {
		UnderwriterId = underwriterId;
	}

	public Timestamp getEffectiveDate() {
		return EffectiveDate;
	}

	public Timestamp setEffectiveDate() {
		return new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getExpiryDate() {
		return ExpiryDate;
	}

	public Timestamp setExpiryDate() {
		return new Timestamp(System.currentTimeMillis());
	}

	public float getAmountInsured() {
		return AmountInsured;
	}

	public void setAmountInsured(float amountInsured) {
		AmountInsured = amountInsured;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
		IsActive = isActive;
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
