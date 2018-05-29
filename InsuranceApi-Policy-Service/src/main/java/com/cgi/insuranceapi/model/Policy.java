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
@Table(name = "Policy", uniqueConstraints = {@UniqueConstraint(columnNames={"policyNumber"})})
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String policyNumber;
	private int insuranceTypeId;
	private String insuredName;
	private int underwriterId;
	private LocalTime effectiveDate;
	private LocalTime expiryDate;
	private float amountInsured;
	private boolean isActive;
	private String createdBy;
	private LocalTime createdDate;
	private String modifiedBy;
	private LocalTime modifiedDate;

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(String policyNumber, int insuranceTypeId, String insuredName, int underwriterId,
			LocalTime effectiveDate, LocalTime expiryDate, float amountInsured, boolean isActive, String createdBy,
			String modifiedBy) {
		super();
		this.policyNumber = policyNumber;
		this.insuranceTypeId = insuranceTypeId;
		this.insuredName = insuredName;
		this.underwriterId = underwriterId;
		this.effectiveDate = effectiveDate;
		this.expiryDate = expiryDate;
		this.amountInsured = amountInsured;
		this.isActive = isActive;
		this.createdBy = createdBy;
		setCreatedDate();
		this.modifiedBy = modifiedBy;
		setModifiedDate();
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public int getInsuranceTypeId() {
		return insuranceTypeId;
	}

	public void setInsuranceTypeId(int insuranceTypeId) {
		this.insuranceTypeId = insuranceTypeId;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public int getUnderwriterId() {
		return underwriterId;
	}

	public void setUnderwriterId(int underwriterId) {
		this.underwriterId = underwriterId;
	}

	public LocalTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalTime localTime) {
		this.effectiveDate = localTime;
	}

	public LocalTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalTime localTime) {
		this.expiryDate = localTime;
	}

	public float getAmountInsured() {
		return amountInsured;
	}

	public void setAmountInsured(float amountInsured) {
		this.amountInsured = amountInsured;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate() {
		this.createdDate = LocalTime.now();
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate() {
		this.modifiedDate = LocalTime.now();
	}

}
