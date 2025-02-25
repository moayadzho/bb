package com.externship.appointment.Person_storage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	@Id
	private String email;
	private String password;

	// Constructor
	public Person() {
	}

	// Getters and Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password; // ستتم عملية التشفير في مكان آخر
	}
}
