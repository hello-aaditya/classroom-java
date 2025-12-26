package dsa.string;


import java.util.Scanner;
public class PalindromeUsingTwoPinterApproach {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string to check palindrome: ");
		String str = input.nextLine();
		
		// ignore the capital or small letter.
		String originalString = new String(str.toLowerCase());
		
		int start = 0;
		int end = originalString.length()-1;
		while(start < end) {
			if(originalString.charAt(start) != originalString.charAt(end)) {
				System.out.println("The word/sentence '" + str + "' is not a palindrome.");
				return;
			}
			start++;
			end--;
		}
		System.out.println("The word/sentence '" + str + "' is a palindrome.");
		
		input.close();
	}

}