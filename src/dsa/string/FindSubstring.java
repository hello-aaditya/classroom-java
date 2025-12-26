package dsa.string;


import java.util.Scanner;
public class FindSubstring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		StringBuilder substr = new StringBuilder();
		
		int size = str.length();
		for(int i=0; i<size; i++) {
			System.out.println("Starting from character: '" + str.charAt(i) + "': ");
			StringBuilder sb = new StringBuilder();
			for(int j=i; j<size; j++) {
				char currentChar = str.charAt(j);
//				if(substr.contains(currentChar)) {
//					
//				}
				sb.append(str.charAt(j));
				System.out.println(sb);
			}
		}
		input.close();
	}

}
