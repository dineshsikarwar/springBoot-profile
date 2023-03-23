package com.springBootProfiles.service;

import java.util.List;

import com.springBootProfiles.domain.Student;


public interface StudentService {
	
	public Student create(Student student);
	public Student update(Student student);
	public Student student(Long studentId);
	public List<Student> studentts();
	public void delete(Long studentId);

}
