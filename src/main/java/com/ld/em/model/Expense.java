package com.ld.em.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document( collection = "Expense")
public class Expense {

	@Id
	private String id;
	
	@DBRef
	@Field(value = "categoryId")
	private Category categoryId;
	
	@Field(value = "amount")
	private double amount;
	
	@Field(value = "comment")
	private String comment;
	
	@Field(value = "createdBy")
	private String createdBy;
	
	@Field(value = "isDeleted")
	private Integer isDeleted;
	
	@Field(value = "accountId")
	private String accountId;
	
	@Field(value = "photo")
	private String photo;
	
	@Field(value = "isPrivate")
	private boolean isPrivate;
	
	@Field(value = "createdDate")
	@CreatedDate
	private Date createdDate = new Date();
	
	@Field(value = "updatedDate")
	@LastModifiedDate
	private Date updatedDate = new Date();

	public Expense(String id, Category categoryId, double amount, String comment, String createdBy, Integer isDeleted,
			String accountId, String photo, boolean isPrivate, Date createdDate, Date updatedDate) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.amount = amount;
		this.comment = comment;
		this.createdBy = createdBy;
		this.isDeleted = isDeleted;
		this.accountId = accountId;
		this.photo = photo;
		this.isPrivate = isPrivate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
		
}
