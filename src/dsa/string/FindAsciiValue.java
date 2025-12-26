package dsa.string;

import java.util.Scanner;
public class FindAsciiValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		int ascii = ch + 0;
		System.out.println("The ASCII value of character '" + ch + "' is: " + ascii);
		
		input.close();
	}

}
