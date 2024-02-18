package com.sit.hibernatemapping.enetity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer bankId;
	private String bankName;
	private String bankIFSC;
	private String bankAddress;
	
	@Column(unique=true,length = 15)
	private Integer bankAccountNumber;
	
	
	public Bank() {
		super();
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankIFSC=" + bankIFSC + ", bankAddress="
				+ bankAddress + ", bankAccountNumber=" + bankAccountNumber + "]";
	}

	public Bank(Integer bankId, String bankName, String bankIFSC, String bankAddress, Integer bankAccountNumber) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankIFSC = bankIFSC;
		this.bankAddress = bankAddress;
		this.bankAccountNumber = bankAccountNumber;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIFSC() {
		return bankIFSC;
	}

	public void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public Integer getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(Integer bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
}
