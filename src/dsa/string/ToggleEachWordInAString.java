package dsa.string;

import  java.util.Scanner;
public class ToggleEachWordInAString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		StringBuilder toggledWord = new StringBuilder("");
		
		for(int i=0; i<str.length(); i++) {
			char currentCharacter = str.charAt(i);
			
			if(currentCharacter >= 'A' && currentCharacter <= 'Z') {
				currentCharacter = (char)(currentCharacter + 32);
			} else if(currentCharacter >= 'a' && currentCharacter <= 'z') {
				currentCharacter = (char)(currentCharacter - 32);
			}
			
			toggledWord.append(currentCharacter);
		}
		
		System.out.println(toggledWord);
		
		input.close();
	}
}
