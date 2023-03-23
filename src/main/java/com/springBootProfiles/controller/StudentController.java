package com.springBootProfiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootProfiles.domain.Student;
import com.springBootProfiles.service.StudentService;
@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return studentService.create(student);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		return studentService.update(student);
	}
	
	@GetMapping("/get/student/{studentId}")
	public Student getStudent(@PathVariable Long studentId) {
		return studentService.student(studentId);
	}
	
	@GetMapping("students")
	public List<Student> students(){
		return studentService.studentts();
	}
	
	@DeleteMapping("/delete/{studentId}")
	public void delete(@PathVariable Long studentId) {
		studentService.delete(studentId);
	}

}
