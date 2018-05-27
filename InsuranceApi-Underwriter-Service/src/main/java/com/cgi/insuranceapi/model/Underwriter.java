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
	private int id;
	private String underwriterName;
	private String createdBy;
	private Timestamp createdDate;
	private String modifiedBy;
	private Timestamp modifiedDate;

	public Underwriter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Underwriter(String underwriterName, String createdBy, String modifiedBy) {
		super();
		this.underwriterName = underwriterName;
		this.createdBy = createdBy;
		createdDate = setcreatedDate();
		this.modifiedBy = modifiedBy;
		modifiedDate = setmodifiedDate();
	}

	public String getunderwriterName() {
		return underwriterName;
	}

	public void setunderwriterName(String underwriterName) {
		this.underwriterName = underwriterName;
	}

	public String getcreatedBy() {
		return createdBy;
	}

	public void setcreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getcreatedDate() {
		return createdDate;
	}

	public Timestamp setcreatedDate() {
		return new Timestamp(System.currentTimeMillis());
	}

	public String getmodifiedBy() {
		return modifiedBy;
	}

	public void setmodifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getmodifiedDate() {
		return modifiedDate;
	}

	public Timestamp setmodifiedDate() {
		return new Timestamp(System.currentTimeMillis());
	}

}
