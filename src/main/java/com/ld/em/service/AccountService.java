package com.ld.em.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ld.em.model.Account;
import com.ld.em.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	public Account saveOrUpdateAccount(Account account) {
		
		return accountRepository.save(account);
		
	}
}
