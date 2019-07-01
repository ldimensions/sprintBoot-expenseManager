package com.ld.em.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Category")
public class Category {

	@Id
	private String id;
	
	@Field(value = "name")
	private String name;
	
	@Field(value = "order")
	private Integer order;
	
	@Field(value = "description")
	private String description;
	
	@Field(value = "createdBy")
	private String createdBy;
	
	@Field(value = "isDeleted")
	private Integer isDeleted;
	
	@Field(value = "accountId")
	private String accountId;
	
	@Field(value = "createdDate")
	@CreatedDate
	private Date createdDate = new Date();
	
	@Field(value = "updatedDate")
	@LastModifiedDate
	private Date updatedDate = new Date();

	public Category(String id, String name, Integer order, String description, String createdBy, String accountId, Integer isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
		this.description = description;
		this.createdBy = createdBy;
		this.accountId = accountId;
		this.isDeleted = isDeleted;
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

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}	
	
}
