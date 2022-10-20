package com.valtech.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.valtech.account.entity.Account;
import com.valtech.account.repository.AccountRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	private Account account;

	@Transactional(propagation=Propagation.REQUIRED)
	public Account createAccount(@RequestBody Account acc) {
		return accountRepository.save(acc);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public Account updateAccount(@RequestBody Account acc) {
		return accountRepository.save(acc);
	}

	public Account getAccount(long id) {
		return accountRepository.findById(id).get();
	}

	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public Account createSavingsAccount(double balance) {
		// TODO Auto-generated method stub
		 account.setAccountType(Account.SAVINGS);
		    account=new Account(account.getAccountType(),balance);
		    return account;
	}

	@Override
	public Account createCurrentfAccount(double balance) {
		// TODO Auto-generated method stub
		account.setAccountType(Account.CURRENT);
	    account=new Account(account.getAccountType(),balance);
	    return account;
	}
}
