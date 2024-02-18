package com.sit.hibernatemapping.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
	
	public int add(int i,int j) {
		
		int k= i+j;
		
		return k;
	}

}
