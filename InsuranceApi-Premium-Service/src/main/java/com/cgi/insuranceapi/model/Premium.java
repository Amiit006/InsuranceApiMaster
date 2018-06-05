package com.cgi.insuranceapi.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Premium")
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int policyId;
	private LocalDateTime dueDate;
	private float minimumPayment;
	private String premiumStatus;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String modifiedBy;
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	public Premium() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Premium(int policyId, LocalDateTime dueDate, float minimumPayment, String premiumStatus, String createdBy,
			String modifiedBy) {
		super();
		this.policyId = policyId;
		this.dueDate = dueDate;
		this.minimumPayment = minimumPayment;
		this.premiumStatus = premiumStatus;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}

	
	public int getpolicyId() {
		return policyId;
	}

	public void setpolicyId(int policyId) {
		this.policyId = policyId;
	}

	public LocalDateTime getdueDate() {
		return dueDate;
	}

	public void setdueDate(LocalDateTime duedate) {
		this.dueDate = duedate;
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

	public LocalDateTime getcreatedDate() {
		return createdDate;
	}

	/*public void setcreatedDate() {
		this.createdDate = LocalDateTime.now();
	}*/

	public String getmodifiedBy() {
		return modifiedBy;
	}

	public void setmodifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getmodifiedDate() {
		return modifiedDate;
	}

	/*public void setmodifiedDate() {
		this.modifiedDate = LocalDateTime.now();
	}*/

}
