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
@Table(name = "Underwriter")
public class Underwriter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String UnderwriterName;
	private String CreatedBy;
	private Timestamp CreatedDate;
	private String ModifiedBy;
	private Timestamp ModifiedDate;

	public Underwriter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Underwriter(String underwriterName, String createdBy, String modifiedBy) {
		super();
		UnderwriterName = underwriterName;
		CreatedBy = createdBy;
		CreatedDate = setCreatedDate();
		ModifiedBy = modifiedBy;
		ModifiedDate = setModifiedDate();
	}

	public String getUnderwriterName() {
		return UnderwriterName;
	}

	public void setUnderwriterName(String underwriterName) {
		UnderwriterName = underwriterName;
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
