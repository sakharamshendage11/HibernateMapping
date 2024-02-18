package com.sit.hibernatemapping.enetity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Integer studentId;

	@Column(unique = true,length = 100) //no duplicate name
	private String studentName;

	private String studentAddress;
    
	@Column(length = 10)
	private Integer studentMobileNumber;
	
	@OneToOne
	@JoinColumn(name="bankId")  //foreign key
	private Bank bank;  //object-> bankId ie foreign key  HAS-A-Relationship= one to class declared in another class as a variable
	
	
	public Student() {
		super();
	}

	public Student(Integer studentId, String studentName, String studentAddress, Integer studentMobileNumber,
			Bank bank) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentMobileNumber = studentMobileNumber;
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentMobileNumber=" + studentMobileNumber + ", bank=" + bank + "]";
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Integer getStudentMobileNumber() {
		return studentMobileNumber;
	}

	public void setStudentMobileNumber(Integer studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
    }
