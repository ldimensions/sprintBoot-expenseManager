package com.ld.em.model;

public class CategoryView {

	private String id;
	private String name;
	private String createdBy;
	private Integer isDeleted;
	
	public CategoryView(String name, String createdBy, Integer isDeleted, String id) {
		super();
		this.name = name;
		this.createdBy = createdBy;
		this.isDeleted = isDeleted;
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

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
