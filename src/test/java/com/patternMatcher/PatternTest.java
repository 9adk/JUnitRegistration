package com.patternMatcher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatternTest {
	
	@Test
	public void givenEntry_whenAllDataValid_thenReturnHappyMood() {
		
		Pattern11 obj = new Pattern11();
		String name = obj.validateInput("Aditya");
		String email = obj.validateEmail("abc.xyz@bl.co.in");
		String number = obj.validateNumber("917887483853");
		String password = obj.validatePassword("Qwerty@123");		
		assertTrue(name == "valid" && email == "valid" && number == "valid" && password == "valid");
		System.out.println("Happy Mood");
		
			
	}
	
	@Test
	public void givenEntry_whenAllDataInalid_thenReturnSadMood() {
		
		Pattern11 obj = new Pattern11();
		String name = obj.validateInput("Aditya");
		String email = obj.validateEmail("abc.xyz@bl.co.in");
		String number = obj.validateNumber("917887483853");
		String password = obj.validatePassword("Qwerty@123");			
		assertTrue(name == "invalid" || email == "invalid" || number == "invalid" || password == "invalid");
		System.out.println("Sad Mood");
		
			
	}

}
