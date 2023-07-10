package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class main {
	@Id
	private int id;
	private String name;
	private long contact;

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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "main [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
}