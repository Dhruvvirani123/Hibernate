package com.Hibernate1.Dhruv_Project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //Primary Key Auto Increment
	private int id;
	private String name, Address;
	
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}

	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}	
}