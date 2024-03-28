package com.example.demo;

 
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/student")
public class Controller {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String index() {
		return "Welcome to spring boot in crud operation";
	}
	
	//handler in creating new recored with DB
	@PostMapping("/saveData")
	public Employee savedata(@RequestBody Employee student) {
		employeeRepository.save(student);			
		return student;
	}
	
	//Handler for fetch the  Single record
	@GetMapping("/getstudent/{rollno}")
	public Employee gettstudeentdsata(@PathVariable int rollno) {
	      java.util.Optional<Employee> student =employeeRepository.findById(rollno);
	     Employee student1=student.get();
	     return student1;	
	}
	//handler for fetch all data in DB
	@GetMapping("/getallstudent")
		public List<Employee> getAll(){
		List<Employee> studentlist=employeeRepository.findAll();
		return  studentlist;
	}	
	//Handler for Delete a Particuler data in DB
	@DeleteMapping("/deletethedata/{rollno}")
	public String DeleteStudent(@PathVariable int rollno) {
		Employee student =employeeRepository.findById(rollno).get();
		if(student!=null) 
			employeeRepository.delete(student);
		return "Delete successfully";
	}
	//Handler for updating  a particular record 
	@PutMapping("/updatedata")
	public Employee updatadatastudent(@RequestBody Employee student) {
		employeeRepository.save(student);
		return student;
	}

}
