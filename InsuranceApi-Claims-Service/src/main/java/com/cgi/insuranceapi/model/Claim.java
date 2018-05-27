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
@Table(name = "Claim")
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private int PolicyId;
	private String ClaimReference;
	private Timestamp ClaimDate;
	private String ClaimStatus;
	private Timestamp ApprovedDate;
	private String CreatedBy;
	private Timestamp CreatedDate;
	private String ModifiedBy;
	private Timestamp ModifiedDate;

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claim(int policyId, String claimReference, 
			String claimStatus, String createdBy, String modifiedBy) {
		super();
		PolicyId = policyId;
		ClaimReference = claimReference;
		ClaimDate = setClaimDate();
		ClaimStatus = claimStatus;
		ApprovedDate = setApprovedDate();
		CreatedBy = createdBy;
		CreatedDate = setClaimDate();
		ModifiedBy = modifiedBy;
		ModifiedDate = setModifiedDate();
	}

	public int getPolicyId() {
		return PolicyId;
	}

	public void setPolicyId(int policyId) {
		PolicyId = policyId;
	}

	public String getClaimReference() {
		return ClaimReference;
	}

	public void setClaimReference(String claimReference) {
		ClaimReference = claimReference;
	}

	public Timestamp getClaimDate() {
		return ClaimDate;
	}

	public Timestamp setClaimDate() {
		return new Timestamp(System.currentTimeMillis());
	}

	public String getClaimStatus() {
		return ClaimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		ClaimStatus = claimStatus;
	}

	public Timestamp getApprovedDate() {
		return ApprovedDate;
	}

	public Timestamp setApprovedDate() {
		return new Timestamp(System.currentTimeMillis());
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
