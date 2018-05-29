package com.cgi.insuranceapi.model;

import java.time.LocalTime;

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
	private int id;
	private int policyId;
	private LocalTime dueDate;
	private float minimumPayment;
	private String premiumStatus;
	private String createdBy;
	private LocalTime createdDate;
	private String modifiedBy;
	private LocalTime modifiedDate;

	public Premium() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Premium(int policyId, LocalTime dueDate, float minimumPayment, String premiumStatus, String createdBy,
			LocalTime createdDate, String modifiedBy, LocalTime modifiedDate) {
		super();
		this.policyId = policyId;
		this.dueDate = dueDate;
		this.minimumPayment = minimumPayment;
		this.premiumStatus = premiumStatus;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	
	public int getpolicyId() {
		return policyId;
	}

	public void setpolicyId(int policyId) {
		this.policyId = policyId;
	}

	public LocalTime getdueDate() {
		return dueDate;
	}

	public void setdueDate() {
		this.dueDate = LocalTime.now();
	}

	public float getminimumPayment() {
		return minimumPayment;
	}

	public void setminimumPayment(float minimumPayment) {
		this.minimumPayment = minimumPayment;
	}

	public String getpremiumStatus() {
		return premiumStatus;
	}

	public void setpremiumStatus(String premiumStatus) {
		this.premiumStatus = premiumStatus;
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
		this.modifiedDate = LocalTime.now();
	}

}
