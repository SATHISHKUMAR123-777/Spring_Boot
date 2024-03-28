package com.example.demo;

/*import jakarta.persistence.Column;*/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")

public class Employee {

	@Id // Id is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Automatic roolno value created
	private int rollno;
	
	/* @Column(name = "emp_name") */
	private String name;

	/* @Column(name = "emp_salary") */
	private float salary;

	private String country;

	private String state;

	public Employee() {

		// TODO Auto-generated constructor stub
	}

	public Employee(int rollno, String name, float salary, String country, String state) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.salary = salary;
		this.country = country;
		this.state = state;
	}
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getcountry() {
		return country;
	}

	public void setcountrye(String country) {
		this.country = country;
	}
}
