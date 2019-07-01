package com.ld.em.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ld.em.model.Category;
import com.ld.em.model.CategoryView;
import com.ld.em.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Value("${userId}")
	private String userId;
	
	@Value("${accountId}")
	private String accountId;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category saveOrUpdateCategory(Category category) {
		category.setCreatedBy(userId);
		category.setAccountId(accountId);
		return categoryRepository.save(category);
	}
	
	public List<CategoryView> getAllCategories() {
		Sort sort = new Sort(Sort.Direction.ASC, "order");
		return categoryRepository.findAllByAccountId(accountId, sort);
	}

	public Category getCategory(String catId) {
		Category category =  categoryRepository.findById(catId).orElse(null);
		if(category == null) {
			return null;
		}
		return category;
	}
}
