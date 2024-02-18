package com.sit.hibernatemapping.enetity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "customer", indexes = { @Index(columnList = "CustId", name = "customer_custId_inx"),
		@Index(columnList = "custName", name = "customer_custName_inx") })
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer CustId;
	private String custName;
	private String custAddress;
	private int custMob;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Order> order; // to display or print order field

	@OneToOne // (cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "bankId")
	private Bank bank;

	public Integer getCustId() {
		return CustId;
	}

	public void setCustId(Integer custId) {
		CustId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public int getCustMob() {
		return custMob;
	}

	public void setCustMob(int custMob) {
		this.custMob = custMob;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
