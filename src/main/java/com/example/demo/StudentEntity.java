package com.example.demo;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
public class StudentEntity 
{
	
	

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id @GeneratedValue int StudId;
	//private Integer StudId;
	private String StudName;
	private String StudDept;

 
	public StudentEntity() {
		super();
		
	}




	public int getStudId() {
		return StudId;
	}

	public void setStudId(int studId) {
		StudId = studId;
	}


	public String getStudName() {
		return StudName;
	}


	public void setStudName(String studName) {
		StudName = studName;
	}


	public String getStudDept() {
		return StudDept;
	}


	public void setStudDept(String studDept) {
		StudDept = studDept;
	}

	
	
	
}
