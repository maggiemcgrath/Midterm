package com.cisc181.core;
import java.util.UUID;

public class Course {
	UUID CourseID = UUID.randomUUID();
	String CourseName;
	int GradePoints;
	private String Major;
	public Object getCourseID() {
		// TODO Auto-generated method stub
		return CourseID;
	}
}
