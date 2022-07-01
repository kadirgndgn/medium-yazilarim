package com.mediumyazi.mediumyazi.entities.concretes;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student implements Serializable{

	@Id

	private int studentId;
	private String studentName;
	private String studentNumber;

	public Student() {

	}

	public Student(int studentId, String studentName, String studentNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
