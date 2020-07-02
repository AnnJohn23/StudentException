package com.example.demo;

import java.util.List;

public interface StudentService {

	StudentEntity addStudent(StudentEntity s);
	List<StudentEntity> getAllDetails();
	StudentEntity StudentUpdate(StudentEntity s, Integer studId);
	StudentEntity getById(Integer studId);
	void deleteStudent(Integer studId);

}
