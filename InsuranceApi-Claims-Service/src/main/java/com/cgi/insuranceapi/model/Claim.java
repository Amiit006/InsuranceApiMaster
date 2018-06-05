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
@Table(name = "Claim")
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int policyId;
	private String claimReference;
	private LocalDateTime claimDate;
	private String claimStatus;
	private LocalDateTime approvedDate;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String modifiedBy;
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Claim(int id, int policyId, String claimReference, LocalDateTime claimDate,
			String claimStatus, LocalDateTime approvedDate, String createdBy, String modifiedBy) {
		super();
		this.id = id;
		this.policyId = policyId;
		this.claimReference = claimReference;
		this.claimDate = claimDate;
		this.claimStatus = claimStatus;
		this.approvedDate = approvedDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
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

	public LocalDateTime getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(LocalDateTime LocalDateTime) {
		this.claimDate = LocalDateTime;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDateTime LocalDateTime) {
		this.approvedDate = LocalDateTime;
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

	/*public void setCreatedDate(LocalDateTime dt) {
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

	/*public void setModifiedDate(LocalDateTime dt) {
		this.modifiedDate = LocalDateTime.now();
	}*/

}
