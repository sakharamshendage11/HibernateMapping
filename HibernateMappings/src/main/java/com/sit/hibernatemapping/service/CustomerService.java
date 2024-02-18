package com.sit.hibernatemapping.service;

import java.util.List;

import com.sit.hibernatemapping.enetity.Customer;

public interface CustomerService {
  
	public Customer getById(Integer custId);
	
	public List<Customer> getAllCustomer();
	
	public void deleteById(Integer custId);
	
	public Customer  saveCustomer(Customer customer);
	
	
}
