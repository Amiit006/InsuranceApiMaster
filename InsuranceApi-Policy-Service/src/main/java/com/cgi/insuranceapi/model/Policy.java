package com.cgi.insuranceapi.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
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
	private LocalDateTime effectiveDate;
	private LocalDateTime expiryDate;
	private float amountInsured;
	private boolean isActive;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String modifiedBy;
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Policy(String policyNumber, int insuranceTypeId, String insuredName, int underwriterId,
			LocalDateTime effectiveDate, LocalDateTime expiryDate, float amountInsured, boolean isActive, String createdBy,
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
		this.modifiedBy = modifiedBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDateTime LocalDateTime) {
		this.effectiveDate = LocalDateTime;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDateTime LocalDateTime) {
		this.expiryDate = LocalDateTime;
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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	/*public void setCreatedDate() {
		this.createdDate = LocalDateTime.now();
	}*/

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	/*public void setModifiedDate() {
		this.modifiedDate = LocalDateTime.now();
	}*/

}
