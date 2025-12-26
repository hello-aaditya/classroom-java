package dsa.string;


import java.util.Scanner;

public class RemoveDuplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int size = str.length();
		
		String unique = "";
				
		for(int i=0; i<size; i++) {
			char ch = str.charAt(i);
			if(unique.indexOf(ch) == -1) {
				unique += ch;
			}
		}
		
		System.out.println(unique + "\nSize: " + unique.length());
		input.close();
	}

}
