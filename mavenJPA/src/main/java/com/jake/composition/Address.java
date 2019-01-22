package com.jake.composition;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	@Id
	@GeneratedValue
	private int addId;
	
	@Column(name = "address_name")
	private String name;
	
	@Column(name="zip_code")
	private int zipCode;
	
	@OneToOne
	@JoinColumn(name="empId")
	public Employees employee;
	
	public Address() {
		
	}

	public int getAddress_id() {
		return addId;
	}

	public void setAddress_id(int addId) {
		this.addId = addId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getZip_code() {
		return zipCode;
	}

	public void setZip_code(int zip_code) {
		this.zipCode = zip_code;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public Address(String name, int zip_code) {
		this.name = name;
		this.zipCode = zip_code;
	}

}
