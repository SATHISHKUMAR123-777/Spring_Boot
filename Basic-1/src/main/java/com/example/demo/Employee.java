package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobilnumber")
	private int Mobilnumber;

	
	public Employee() {
		
	}


	public Employee(int id, String name, int mobilnumber) {
		super();
		this.id = id;
		this.name = name;
		Mobilnumber = mobilnumber;
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


	public int getMobilnumber() {
		return Mobilnumber;
	}


	public void setMobilnumber(int mobilnumber) {
		Mobilnumber = mobilnumber;
	}
	
	
}
