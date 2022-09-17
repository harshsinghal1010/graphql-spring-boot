package com.gql.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gql.request.SampleRequest;
import com.gql.response.StudentResponse;
import com.gql.service.StudentService;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	StudentService studentService;
	
	public String firstQuery() {
		return "First Query";
	}
	
	public String secondQuery() {
		return "second Query";
	}
	
	public String getName(SampleRequest sampleRequest) {
		return sampleRequest.getFirstName() + " "+sampleRequest.getLastName();
	}
	
	public StudentResponse getStudent(long id) {
		return new StudentResponse(studentService.getStudentById(id));
	}
}
