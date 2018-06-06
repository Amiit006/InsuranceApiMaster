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
@Table(name = "Underwriter", uniqueConstraints = { @UniqueConstraint(columnNames = { "underwriterName" }) })
public class Underwriter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String underwriterName;
	private String createdBy;
	@CreationTimestamp
	private LocalDateTime createdDate;
	private String modifiedBy;
	@UpdateTimestamp
	private LocalDateTime modifiedDate;

	public Underwriter() {
		super();
	}

	public Underwriter(String underwriterName, String createdBy, String modifiedBy) {
		super();
		this.underwriterName = underwriterName;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnderwriterName() {
		return underwriterName;
	}

	public void setUnderwriterName(String underwriterName) {
		this.underwriterName = underwriterName;
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

	/*public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
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

	/*public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}*/

	

}
