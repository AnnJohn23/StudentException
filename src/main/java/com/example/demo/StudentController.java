package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	StudentService ser;
	
	@PostMapping
	public StudentEntity addStudent(@RequestBody StudentEntity s)
	{
		return ser.addStudent(s);
		
	}
	
	@GetMapping
	public List<StudentEntity> getAllDetails()
	{
		return ser.getAllDetails();
	}
	 

@GetMapping("/{StudId}")
public ResponseEntity<StudentEntity> getById(@PathVariable ("StudId") Integer StudId)throws StudentNotFoundException  {
StudentEntity s=ser.getById(StudId);
return new ResponseEntity<StudentEntity>(s, new HttpHeaders(),HttpStatus.OK); 
}

	
//	@GetMapping("/{StudId}")
//	public StudentEntity getById(@PathVariable int StudId) {
//		
//	return ser.getById(StudId);	
//	}
//	
//	
	
	@PutMapping("/{StudId}")
	public StudentEntity StudentUpdate(@RequestBody StudentEntity s,@PathVariable Integer StudId) {
		return ser.StudentUpdate(s,StudId);
		
	}

	@DeleteMapping("/{StudId}")
	public void deleteStudent(@PathVariable Integer StudId) {
		 ser.deleteStudent(StudId);
		
	}
}
