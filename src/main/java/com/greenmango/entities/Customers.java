package com.greenmango.entities;
// Generated Mar 30, 2019 11:34:21 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customers generated by hbm2java
 */
@Entity
@Table(name = "customers", catalog = "green_mango")
public class Customers implements java.io.Serializable {

	private Integer customersId;
	private String identity;
	private String identityNumber;
	private String firstname;
	private String lastname;
	private String phone;
	private String address;

	public Customers() {
	}

	public Customers(String identity, String identityNumber) {
		this.identity = identity;
		this.identityNumber = identityNumber;
	}

	public Customers(String identity, String identityNumber, String firstname, String lastname, String phone,
			String address) {
		this.identity = identity;
		this.identityNumber = identityNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "customers_id", unique = true, nullable = false)
	public Integer getCustomersId() {
		return this.customersId;
	}

	public void setCustomersId(Integer customersId) {
		this.customersId = customersId;
	}

	@Column(name = "identity", nullable = false, length = 30)
	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Column(name = "identity_number", nullable = false, length = 50)
	public String getIdentityNumber() {
		return this.identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	@Column(name = "firstname", length = 50)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", length = 50)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "phone", length = 15)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
