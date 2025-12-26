package dsa.string;

import java.util.Scanner;
public class CountVowel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		String originalStr = str.toLowerCase();
		
		int size = originalStr.length();
		int count = 0;
		
		for(int i=0; i<size; i++) {
			if(isVowel(originalStr.charAt(i)) == true) {
				count++;
			}
		}
		System.out.println("Original String: " + str);
		System.out.println("Number of vowels: " + count);
		

		input.close();
	}
	public static boolean isVowel(char ch) {
		if( (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')) {
			return true;
		}
		return false;
	}

}
