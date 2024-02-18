package com.sit.hibernatemapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.hibernatemapping.enetity.Customer;
import com.sit.hibernatemapping.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements  CustomerService {
	
    @Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer getById(Integer custId) {
		return customerRepository.findById(custId).get();
	}
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
	@Override
	public void deleteById(Integer custId) {
		 customerRepository.deleteById(custId);;
	}
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
