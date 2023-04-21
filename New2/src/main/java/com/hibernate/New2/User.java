package com.hibernate.New2;

public class User {
	
	private int id;
	private String name;
	private double value;
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
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
}