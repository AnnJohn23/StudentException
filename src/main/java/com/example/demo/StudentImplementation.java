package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

@Service
public class StudentImplementation implements StudentService{
	
	@Autowired
	StudentRepository res;

	//ADD
	public StudentEntity addStudent(StudentEntity s) {
		
		return res.save(s);
	}

	//GET ALL DETAILS
	public List<StudentEntity> getAllDetails() {
		
		return (List<StudentEntity>) res.findAll();
	}

	//UPDATE
	public StudentEntity StudentUpdate(StudentEntity s, Integer studId) {
		Optional<StudentEntity>optStud=res.findById(studId);
		return res.save(s);
	}

	//GET BY ID
	public StudentEntity  getById(Integer studId) throws StudentNotFoundException {
		Optional<StudentEntity>optStud=res.findById(studId);
		if(optStud.isPresent()) {
			return optStud.get();
		}else {
			System.out.println("Exception");
			throw new StudentNotFoundException("invalid");
		}
	}

	//DELETEs
	public void deleteStudent(Integer studId) {
		
		  res.deleteById(studId);;
	}
	
	

}
