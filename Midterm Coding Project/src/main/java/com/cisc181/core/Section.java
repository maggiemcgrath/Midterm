package com.cisc181.core;
import java.util.UUID;


public class Section {
	UUID CourseID = UUID.randomUUID();
	UUID SemesterID = UUID.randomUUID();
	UUID SectionID = UUID.randomUUID();
	int RoomID;
	public UUID getSectionID() {
		// TODO Auto-generated method stub
		return this.SectionID;
	}
	


}
