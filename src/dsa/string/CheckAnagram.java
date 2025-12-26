package dsa.string;



import java.util.Scanner;
public class CheckAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String str1 = input.nextLine();
		
		System.out.println("Enter second string: ");
		String str2 = input.nextLine();
		
		System.out.println(isAnagram(str1, str2) == true ? "Given String " + str1 + " and " + str2 + " is anagram" : "Given String " + str1 + " and " + str2 + " is not anagram");
		
		input.close();
	}
	
	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		int sizeOfStr1 = str1.length();
		int sizeOfStr2 = str2.length();
		
		if (sizeOfStr1 != sizeOfStr2) {
			return false;
		}
		
		int freq[] = new int[26];
		
		// to store the frequency of characters of str1
		for(int i=0; i<str1.length(); i++) {
			freq[str1.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<str2.length(); i++) {
			freq[str2.charAt(i) - 'a']--;
		}
		
		// check
		for(int i=0; i<26; i++) {
			if(freq[i] != 0) {
				return false;
			}
		}
		return true;
	}
	

}
