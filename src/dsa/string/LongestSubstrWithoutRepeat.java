package dsa.string;


import java.util.Scanner;
public class LongestSubstrWithoutRepeat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		int size = str.length();
		
		String substr = "";
		int maximum = 0;
		
		for(int i=0; i<size; i++) {	
			char currentChar = str.charAt(i);
			int index = substr.indexOf(currentChar);
			
			if(index != -1) {
				substr = substr.substring(index+1);
			}
			
			substr += currentChar;
			maximum = Math.max(maximum, substr.length());
		}
		System.out.println(maximum);
	}
}
