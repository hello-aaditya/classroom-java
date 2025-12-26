package dsa.string;

import java.util.Scanner;
import java.util.HashMap;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ENTER YOUR STRING: ");
		String str = input.nextLine();
		
		System.out.println(firstNonRepeatingCharacter(str));
		
		input.close();
	}
	
	public static String firstNonRepeatingCharacter(String str) {
		HashMap<Character, Integer> freqMap = new HashMap<>();
		
		int size = str.length();
		for(int i=0; i<size; i++) {
			char currentChar = str.charAt(i);
			
			freqMap.put(currentChar, freqMap.getOrDefault(currentChar, 0) + 1);
		}
		
		for(int i=0; i<size; i++) {
			char currentChar = str.charAt(i);
			if(freqMap.get(currentChar) == 1) {
				return currentChar + "";
			}
		}
		return "$";
	}
}
