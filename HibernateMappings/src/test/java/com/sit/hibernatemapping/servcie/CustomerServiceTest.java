package com.sit.hibernatemapping.servcie;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.sit.hibernatemapping.enetity.Customer;
import com.sit.hibernatemapping.enetity.Order;
import com.sit.hibernatemapping.service.CustomerService;

@SpringBootTest
public class CustomerServiceTest {
	@Autowired
	private CustomerService customerService;
	@Test
	public void testGetAllCustomer() {
		List<Customer>list=customerService.getAllCustomer();
	//	Assertions.assertTrue(list.isEmpty());
		Assertions.assertFalse(list.isEmpty());
	}
	@Test
	public void testGetById() {
		Customer expectedCustomer=new Customer();
		expectedCustomer.setCustId(1);
		expectedCustomer.setCustAddress("Akluj");
		expectedCustomer.setCustMob(12453);
		expectedCustomer.setCustName("cnv");
		
		/*
		 * ArrayList<Order> orderList= new ArrayList<>(); Order order = new Order();
		 * order.setOrderID(1); order.setOrderAmount(111);
		 * order.setOrderStatus("pending"); order.setOrderDate(23);
		 * 
		 * 
		 * Order order1 = new Order(); order1.setOrderID(2); order1.setOrderAmount(123);
		 * order1.setOrderStatus("success"); order1.setOrderDate(21);
		 */
		
	/*	orderList.add(order);
		orderList.add(order1);
		expectedCustomer.setOrder(orderList);
		Customer customer=customerService.getById(1);
	//	Assertions.assertEquals(expectedCustomer, customer);
		System.out.println(customer);
		System.out.println(expectedCustomer);
	}*/
	
	
	}
}
