package com.Hibernate1.Dhruv_Project;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Address_ID")
	private int id;

	@Column(length = 70, name = "GOOD_STREET")
	private String street;

	@Column(length = 10)
	private String city;

	private boolean isopen;

	@Transient
	private double x;

//	@Temporal(TemporalType.DATE)
//	private Date adddate;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String street, String city, boolean isopen, double x, Date adddate) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
//		this.adddate = adddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isIsopen() {
		return isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

//	public Date getAdddate() {
//		return adddate;
//	}

//	public void setAdddate(Date adddate) {
//		this.adddate = adddate;
//	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", isopen=" + isopen + ", x=" + x
				+ ", adddate=" +"]";
	}
}