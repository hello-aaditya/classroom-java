package dsa.string;

import java.util.Scanner;
public class CountFrequency {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your string in lower case: ");
		String str = input.nextLine();
		
		int size = str.length();
		System.out.println("Character Frequencies: ");
		for(int i=0; i<size; i++) {
			char currentChar = str.charAt(i);
			if(str.indexOf(currentChar) >= i) {
				int count = totalCount(str, currentChar);
				System.out.println(currentChar + ": " + count);
			}
		}
		
		input.close();
	}
	
	public static int totalCount(String str, char ch) {
		int count = 0;
		int size = str.length();
		
		for(int i=0; i<size; i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

}
