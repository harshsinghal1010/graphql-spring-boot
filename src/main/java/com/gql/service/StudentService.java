package com.gql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gql.entity.Student;
import com.gql.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudentById (long id) {
		return studentRepository.findById(id).get();
	}
}
