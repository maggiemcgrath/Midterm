package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	UUID SectionID = UUID.randomUUID();
	UUID StudentID = UUID.randomUUID();
	UUID EnrollmentID = UUID.randomUUID();
	double Grade;

	public Enrollment(UUID SectionID, Object object) {
		SectionID = SectionID;
		object = object;
		this.EnrollmentID = EnrollmentID;
	
	}
	private Enrollment() {
	}
	private void SetGrade(double grade) {
		Grade = grade;
	}
	public Object getSectionID() {
		// TODO Auto-generated method stub
		return this.SectionID;
	}
	

}

