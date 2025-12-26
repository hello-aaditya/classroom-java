package dsa.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

	public static void main(String[] args) {
		String input = "pwgerg1";
		
		Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
		
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches()) {
			System.out.println("Valid String");
		} else {
			System.out.println("Invalid String");
		}

	}

}
