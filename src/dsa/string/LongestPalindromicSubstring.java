package dsa.string;

import java.util.Scanner;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		int maxLength = 0;
		String longestPalindrome = "";
		
		for(int i=0; i<str.length(); i++) {

			for(int j=i+1; j<=str.length(); j++) {
				String currentSubstring = str.substring(i, j);
				
				if(isPalindrome(currentSubstring) == true) {
					System.out.println(currentSubstring + ": true");
					int currentLength = currentSubstring.length();
					if(currentLength > maxLength) {
						maxLength = currentLength;
						longestPalindrome = "" + currentSubstring;
					}
				}
				
			}
		}
		System.out.println(longestPalindrome);

		
		input.close();
	}
	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		
		while(start<=end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
