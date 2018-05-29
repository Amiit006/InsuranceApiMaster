package com.cgi.insuranceapi.model;

import java.sql.Timestamp;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Claim")
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int policyId;
	private String claimReference;
	private LocalTime claimDate;
	private String claimStatus;
	private LocalTime approvedDate;
	private String createdBy;
	private LocalTime createdDate;
	private String modifiedBy;
	private LocalTime modifiedDate;

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claim(int id, int policyId, String claimReference, LocalTime claimDate,
			String claimStatus, LocalTime approvedDate, String createdBy, String modifiedBy) {
		super();
		this.id = id;
		this.policyId = policyId;
		this.claimReference = claimReference;
		this.claimDate = claimDate;
		this.claimStatus = claimStatus;
		this.approvedDate = approvedDate;
		this.createdBy = createdBy;
		setCreatedDate();
		this.modifiedBy = modifiedBy;
		setModifiedDate();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getClaimReference() {
		return claimReference;
	}

	public void setClaimReference(String claimReference) {
		this.claimReference = claimReference;
	}

	public LocalTime getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(LocalTime localTime) {
		this.claimDate = localTime;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public LocalTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalTime localTime) {
		this.approvedDate = localTime;
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
