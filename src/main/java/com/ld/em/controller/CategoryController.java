package com.ld.em.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ld.em.model.Category;
import com.ld.em.model.CategoryView;
import com.ld.em.service.CategoryService;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class CategoryController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/category", method = RequestMethod.POST)
	public ResponseEntity<?> createCategory(@Valid @RequestBody Category category) {
						
		categoryService.saveOrUpdateCategory(category);		
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAllCategory", method = RequestMethod.GET)
	public List<CategoryView> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@RequestMapping(value = "/getCategory/{catId}", method = RequestMethod.GET)
	public ResponseEntity<?> getCategory(@PathVariable String catId) {
		Category category =  categoryService.getCategory(catId);
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}

}
