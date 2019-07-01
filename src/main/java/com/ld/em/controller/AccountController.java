package com.ld.em.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ld.em.model.Account;
import com.ld.em.service.AccountService;

@RestController
@CrossOrigin
public class AccountController {

	@Autowired 
	private AccountService accountService;
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/api/account", method = RequestMethod.POST)
	public ResponseEntity<?> createNewAccount(@Valid @RequestBody Account account ){
		
		LOG.info("createNewAccount fileds: {}.", account);
		
		Account acc = accountService.saveOrUpdateAccount(account);
		return new ResponseEntity<Account>(acc, HttpStatus.CREATED);
	}
	
}
