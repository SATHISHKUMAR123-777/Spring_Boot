package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class Employee_controller {

	@Autowired
	public Employeerepo employeeRepository;
	
	@PostMapping("/saveEmployee")
	public Employee savedata(@RequestBody Employee employee) {
		employeeRepository.save(employee);			
		return employee;
	}
 
	@GetMapping("/getallstudent")
	public List<Employee> getAll(){
	List<Employee> studentlist=employeeRepository.findAll();
	return  studentlist;
}	
	
	@PutMapping("/updatedata")
	public Employee updatadatastudent(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}
	//Handler for Delete a Particuler data in DB
	@DeleteMapping("/deletethedata/{rollno}")
	public String DeleteStudent(@PathVariable int rollno) {
		Employee employee =employeeRepository.findById(rollno).get();
		if(employee!=null) 
			employeeRepository.delete(employee);
		return "Delete successfully";
	}
	
}
