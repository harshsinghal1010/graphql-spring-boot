package com.gql.response;

import com.gql.entity.Subject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectResponse {

	private Long id;
	
	private String subjectName;

	private String marksObtained;
	
	public SubjectResponse (Subject subject) {
		this.id = subject.getId();
		this.subjectName = subject.getSubjectName();
		this.marksObtained = subject.getMarksObtained();
	}
}
