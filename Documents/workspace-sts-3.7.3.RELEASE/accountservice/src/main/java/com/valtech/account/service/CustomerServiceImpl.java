package com.valtech.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.account.entity.Customer;
import com.valtech.account.repository.CustomerRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer createCustomer(Customer cust) {
		return customerRepository.save(cust);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public Customer updateCustomer(Customer cust) {
		return customerRepository.save(cust);
	}

	public Customer getCustomer(long id) {
		return customerRepository.findById(id).get();
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

}
