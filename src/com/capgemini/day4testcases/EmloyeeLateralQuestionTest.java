package com.capgemini.day4testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.day4.President;
import com.day4.SalesManager;

class EmloyeeLateralQuestionTest {

	@Test
	void testEmployeeLateral() {
		
		assertEquals(16500, new SalesManager("12345","Manjula",10000).calculateNetSalary());
		assertEquals(20100, new President("12345","Manjula",10000,500).calculateNetSalary());
		
	}

}
