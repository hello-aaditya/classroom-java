package dsa.string;


import java.util.Scanner;
public class StringRotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = "HelloWorld";
		
		int position = 2;
		String direction = "right"; 
		
		if(direction.equals("left")) {
			String firstHalf = str.substring(0, position);
			String secondHalf = str.substring(position);
			
			System.out.println(secondHalf.concat(firstHalf));
		} else {
			String firstHalf = str.substring(0, str.length()-(position));
			String secondHalf = str.substring(str.length()-position);
			
			System.out.println(secondHalf.concat(firstHalf));
		}
	}

}
