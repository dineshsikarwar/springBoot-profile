package com.springBootProfiles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootProfiles.domain.Student;
import com.springBootProfiles.repository.StudentRepository;
import com.springBootProfiles.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student create(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public Student update(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public Student student(Long studentId) {
		return studentRepository.findById(studentId).get();
	}
	
	@Override
	public List<Student> studentts(){
		return studentRepository.findAll();
	}
	
	@Override
	public void delete(Long studentId) {
		studentRepository.deleteById(studentId);	
	}

}
