package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {
	UUID SemesterID = UUID.randomUUID();
	Date StartDate = new Date();
	Date EndDate = new Date();
	public Object getSemesterID() {
		// TODO Auto-generated method stub
		return this.SemesterID;
	}

}
