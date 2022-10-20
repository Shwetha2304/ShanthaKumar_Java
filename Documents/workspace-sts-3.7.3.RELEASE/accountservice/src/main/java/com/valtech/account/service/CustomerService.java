package com.valtech.account.service;

import java.util.List;

import com.valtech.account.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer cust);

	Customer updateCustomer(Customer cust);

	Customer getCustomer(long id);

	List<Customer> getAllCustomers();

}