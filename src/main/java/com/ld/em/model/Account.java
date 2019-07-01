package com.ld.em.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

@Document(collection = "Account")
public class Account {
	
	@Id
	private String id;
	
	@Field(value = "name")
	private String name;
	
	@Field(value = "createdBy")
	private String createdBy;
	
	@Field(value = "createdDate")
	@CreatedDate
	private Date createdDate = new Date();
	
	@Field(value = "updatedDate")
	@LastModifiedDate
	private Date updatedDate;

	//private Map<String, String> userSettings = new HashMap<>();
	//@Indexed(unique = true)
	
	public Account(String id, String name, String createdBy, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.name = name;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
