package com.sit.hibernatemapping.servcie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sit.hibernatemapping.service.Calculator;

@SpringBootTest
public class CalculatorTest {
	
	  @Autowired private Calculator calculator;
	 
	@Test
	public void testAdd() {
		
		  int actualoutput=calculator.add(12, 14);//
		  
		  Assertions.assertEquals(26,actualoutput);
		  
		 
		
		/*
		 * String str=null; Assertions.assertNull(str);
		 */
		
		/*
		 * String str="Motiram"; Assertions.assertNotNull(str);
		 */
		
		
	//	List<Integer>list=Arrays.asList(1,2,3,4,5);
		/*
		 * Assertions.assertEquals(5, list.size());
		 * 
		 * Assertions.assertNotEquals(4, list.size());
		 */
		
	//	Assertions.assertTrue(list.isEmpty());
	//	Assertions.assertFalse(list.isEmpty());
		
		
	}


}
