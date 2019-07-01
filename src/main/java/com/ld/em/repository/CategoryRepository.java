package com.ld.em.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ld.em.model.Category;
import com.ld.em.model.CategoryView;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {

	List<CategoryView> findAllByAccountId(String accountId, Sort sort);
	
//	@Query("{'accountId' : {$eq : ?0}}")
//	List<Category> findAllByAccountId(String accountId);
}
