package dsa.string;


import java.util.Scanner;
public class RemoveVowelsFromAString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int size = str.length();
		
		StringBuilder woVowel = new StringBuilder();
		
		for(int i=0; i<size; i++) {
			char currentChar = str.charAt(i);
			if(isVowel(currentChar) == false) {
				woVowel.append(currentChar);
			}
		}
		System.out.println(woVowel);
		
		input.close();
	}
	public static boolean isVowel(char ch) {
		int ascii = ch + 0;
		switch(ascii) {
		case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117 : return true;
		default: return false;
		}
	}

}
