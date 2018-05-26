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
@Table(name = "Premium")
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private int PolicyId;
	private Timestamp DueDate;
	private float MinimumPayment;
	private String PremiumStatus;
	private String CreatedBy;
	private Timestamp CreatedDate;
	private String ModifiedBy;
	private Timestamp ModifiedDate;

	public Premium() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Premium(int policyId, Timestamp dueDate, float minimumPayment, String premiumStatus, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {
		super();
		PolicyId = policyId;
		DueDate = dueDate;
		MinimumPayment = minimumPayment;
		PremiumStatus = premiumStatus;
		CreatedBy = createdBy;
		CreatedDate = createdDate;
		ModifiedBy = modifiedBy;
		ModifiedDate = modifiedDate;
	}

	
	public int getPolicyId() {
		return PolicyId;
	}

	public void setPolicyId(int policyId) {
		PolicyId = policyId;
	}

	public Timestamp getDueDate() {
		return DueDate;
	}

	public Timestamp setDueDate() {
		return new Timestamp(System.currentTimeMillis());
	}

	public float getMinimumPayment() {
		return MinimumPayment;
	}

	public void setMinimumPayment(float minimumPayment) {
		MinimumPayment = minimumPayment;
	}

	public String getPremiumStatus() {
		return PremiumStatus;
	}

	public void setPremiumStatus(String premiumStatus) {
		PremiumStatus = premiumStatus;
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
