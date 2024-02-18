package com.sit.hibernatemapping.enetity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name ="Orders")
public class Order {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderID;
	private Integer orderDate;
	private double  orderAmount;
	private String  orderStatus;
	
 	
	/*
	 *  @ManyToOne // to save data
	 * 
	 * @JsonBackReference
	 * 
	 * @JoinColumn(name ="Cust_ID") //foreign key private Customer customer;
	 */


    
   }
