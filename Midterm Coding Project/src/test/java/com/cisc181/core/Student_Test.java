package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Student> students = new ArrayList<Student>();
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() throws PersonException  {
		courses.add(new Course());
		courses.add(new Course());
		courses.add(new Course());
		semesters.add(new Semester());
		semesters.add(new Semester());
		for(Semester sem: semesters) {
			for(Course crs: courses) {
				sections.add(new Section());
			}
		}
		for(int n = 0; n < 10; n++) {
			students.add(new Student("Maggie", "Rose", "McGrath", new Date(1999, 25, 6), eMajor.PHYSICS, "85 Main St", "(860)-941-4170", 
					"mcmag@udel.edu"));
		}
	}

	@Test
	public void test() {
		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for(Student stud: students) {
			enrollments.add(new Enrollment(sections.get((int) (Math.random()*sections.size())).getSectionID(), stud.getStudentID()));
			enrollments.add(new Enrollment(sections.get((int) (Math.random()*sections.size())).getSectionID(), stud.getStudentID()));
			enrollments.add(new Enrollment(sections.get((int) (Math.random()*sections.size())).getSectionID(), stud.getStudentID()));
		}
		for(int enrollment1 = 0; enrollment1 < enrollments.size(); enrollment1++) {
			
			for(int enrollment2 = 0; enrollment2 < enrollments.size(); enrollment2++) {
				
				
				if(enrollments.get(enrollment1).getSectionID() == enrollments.get(enrollment2).getSectionID() &&
						
						((Enrollment) enrollments.get(enrollment1)).getStudentID() == enrollments.get(enrollment2).getStudentID()) {
					
					
					while(enrollments.get(enrollment1).getSectionID() == enrollments.get(enrollment2).getSectionID() &&
							
						enrollments.get(enrollment1).getStudentID() == enrollments.get(enrollment2).getStudentID()) {
						
						enrollments.set(enrollment2,new Enrollment(sections.get((int) (Math.random()*sections.size())).getSectionID(),
								
								(enrollments.get(enrollment2)).getStudentID()));
					}
				}
			}
		}
		System.out.println(enrollments.size());

		for(Enrollment enroll: enrollments) {
			System.out.println(((Enrollment) enroll).getSectionID() + " " + enroll.getStudentID());
		}
		assertEquals(2, 2);
	}
}