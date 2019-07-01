package com.ld.em.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ld.em.model.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

}
