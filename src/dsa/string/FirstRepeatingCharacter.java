package dsa.string;

import java.util.Scanner;

public class FirstRepeatingCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ENTER YOUR STRING: ");
		String str = input.nextLine();
		
		System.out.println(firstRepeatingCharacter(str));
		
		input.close();
	}
	
	public static String firstRepeatingCharacter(String str) {
		char[] charArray = str.toCharArray();
		int size = charArray.length;
		
		int[] frequencyArr = new int[26]; 
		for(int i=0; i<size; i++) {
			char currentChar = charArray[i];
			
			int currentIndex = currentChar - 'a';
			
			if(frequencyArr[currentIndex] >= 1) {
				return currentChar + "";
			}
			
			frequencyArr[currentIndex]++;
		}
		
		return "-1";
		
	}
	
	
	
}
