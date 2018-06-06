package com.cgi.insuranceapi.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

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
@Table(name = "InsuranceType", uniqueConstraints = { @UniqueConstraint(columnNames = { "insuranceTypeName" }) })
public class InsuranceType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String insuranceTypeName;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String modifiedBy;
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	public InsuranceType(int id, String insuranceTypeName, String createdBy, String modifiedBy) {
		super();
		this.id = id;
		this.insuranceTypeName = insuranceTypeName;
		this.createdBy = createdBy;
		this.createdDate = LocalDateTime.now();
		this.modifiedBy = modifiedBy;
		this.modifiedDate = LocalDateTime.now();
	}

	public InsuranceType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsuranceTypeName() {
		return insuranceTypeName;
	}

	public void setInsuranceTypeName(String insuranceTypeName) {
		this.insuranceTypeName = insuranceTypeName;
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

	
	
	@Override
	public String toString() {
		return "InsuranceType [id=" + id + ", insuranceTypeName=" + insuranceTypeName + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
				+ "]";
	}

	
}
