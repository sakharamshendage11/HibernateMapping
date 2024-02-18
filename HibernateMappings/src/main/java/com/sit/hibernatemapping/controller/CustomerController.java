package com.sit.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.hibernatemapping.enetity.Customer;
import com.sit.hibernatemapping.service.CustomerService;

@RestController

public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/getbyId/{custId}",produces=MediaType.APPLICATION_ATOM_XML_VALUE,
			consumes=MediaType.APPLICATION_ATOM_XML_VALUE) //http://localhost:8080/getbyId/1
	public ResponseEntity<Customer>  getById(@PathVariable Integer custId) {
		Customer customer = customerService.getById(custId);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);//requires body status 

	}

//	@GetMapping(value = "/")
	@GetMapping(value = "/getallcustomers",produces=MediaType.APPLICATION_ATOM_XML_VALUE,consumes=MediaType.APPLICATION_ATOM_XML_VALUE)

	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();

	}

	@DeleteMapping(value = "/deleteById/{custId}") // http://localhost:8080/getbyId/1
	public String deleteById(@PathVariable Integer custId) {

		customerService.deleteById(custId);
		return "record deleted" + custId;

	}

	@PostMapping(value = "/savecustomer") // http://localhost:8080/getbyId/1
//	@PostMapping(produces=MediaType.APPLICATION_ATOM_XML_VALUE)
	public Customer saveCustomer(@RequestBody Customer customer) {

		Customer customer2 = customerService.saveCustomer(customer);

		return customer2;

	}

	/*
	 * @GetMapping(value="/getbyId") //http://localhost:8080/getbyId?custId=1 public
	 * Customer getById(@RequestParam Integer custId){
	 * 
	 * return customerService.getById(custId);
	 * 
	 * }
	 */
}
