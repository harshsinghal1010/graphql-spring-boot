package com.gql.resolver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gql.entity.Student;
import com.gql.entity.Subject;
import com.gql.enums.SubjectEnum;
import com.gql.response.StudentResponse;
import com.gql.response.SubjectResponse;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse>{
	
	public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse,SubjectEnum subjectEnum){
		
		List<SubjectResponse> subList = new ArrayList<>();
		Student std = studentResponse.getStudent();
		System.out.println("SUB ENUM "+subjectEnum.name());
		
		if(std.getLearningSubjects()!=null) {
			for (Subject subject: std.getLearningSubjects()) {
				System.out.println("SUB NAME "+subject.getMarksObtained());
				if(subjectEnum.name().equalsIgnoreCase("All")) {
					subList.add(new SubjectResponse(subject));
				}
				else if(subject.getMarksObtained().equalsIgnoreCase(subjectEnum.name())) {
					subList.add(new SubjectResponse(subject));
				}
				
				
			}
		}
		return subList;
	}

}
