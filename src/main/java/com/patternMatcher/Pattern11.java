package com.patternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern11 {
	
	public String validateEmail(String Email) {
		String expression = "(abc?[.][A-Za-z]*@bl[.]co[.][A-Za-z]{2,})$"; // Pattern for Email
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	
	
}
