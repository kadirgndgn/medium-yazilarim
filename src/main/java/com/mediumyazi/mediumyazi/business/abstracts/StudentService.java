package com.mediumyazi.mediumyazi.business.abstracts;

import java.util.List;

import com.mediumyazi.mediumyazi.entities.concretes.Student;

public interface StudentService {
	
	Student add(Student student);
	List<Student> getAll() throws InterruptedException;
	void delete(int studentId);

}
