package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> staff = new ArrayList<Staff>();
	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() throws PersonException {
		
		staff.add(new Staff("Maggie", "Rose", "McGrath", new Date(), "85 Main St", "(860)-941-4170", "mcmag@udel.edu", 
				"8am - 4pm", 10, 60000.00, new Date(2007, 3, 1), eTitle.MR));
		staff.add(new Staff("Maggie", "Rose", "McGrath", new Date(), "85 Main St", "(860)-941-4170", "mcmag@udel.edu", 
				"8am - 4pm", 10, 60000.00, new Date(2007, 3, 1), eTitle.MR));
		staff.add(new Staff("Maggie", "Rose", "McGrath", new Date(), "85 Main St", "(860)-941-4170", "mcmag@udel.edu", 
				"8am - 4pm", 10, 60000.00, new Date(2007, 3, 1), eTitle.MR));
		staff.add(new Staff("Maggie", "Rose", "McGrath", new Date(), "85 Main St", "(860)-941-4170", "mcmag@udel.edu", 
				"8am - 4pm", 10, 60000.00, new Date(2007, 3, 1), eTitle.MR));
		staff.add(new Staff("Maggie", "Rose", "McGrath", new Date(), "85 Main St", "(860)-941-4170", "mcmag@udel.edu", 
				"8am - 4pm", 10, 60000.00, new Date(2007, 3, 1), eTitle.MR));
	}
	
	@Test
	public void test() {
		double totalSalary = 0;
		for(Staff s: staff) {
			totalSalary += s.getSalary();			
		}
		assertEquals(55340.00,totalSalary/staff.size(), 0.01);
		//test
	}	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test2() throws PersonException  {
		staff.add(new Staff("Maggie", "Rose", "McGrath", new Date(1999, 25, 6), "85 Main St", "8609414170", "mcmag@udel.edu", 
				"8am - 4pm", 6, 62000.00, new Date(2007, 3, 1), eTitle.MR));
		staff.add(new Staff("Maggie", "Rose", "McGrath", new Date(2315, 20, 4), "85 Main St", "(860)-941-4170", "mcmag@udel.edu", 
				"8am - 4pm", 6, 62000.00, new Date(2007, 3, 1), eTitle.MR));
	}

}