package com.mediumyazi.mediumyazi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mediumyazi.mediumyazi.business.abstracts.StudentService;
import com.mediumyazi.mediumyazi.entities.concretes.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAll() throws InterruptedException {
		return ResponseEntity.ok(this.studentService.getAll());
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> add(@RequestBody Student student) {
		return ResponseEntity.ok(this.studentService.add(student));
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteById(@RequestParam int studentId) {
		this.studentService.delete(studentId);
		return ResponseEntity.ok("Öğrenci Silindi");
	}
	
}
