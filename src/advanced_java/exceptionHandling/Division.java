package advanced_java.exceptionHandling;


import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("ENTER DIVIDEND: ");
		int dividend = input.nextInt();
		
		System.out.print("ENTER DIVISOR: ");
		int divisor = input.nextInt();
		
		int quotient = dividend / divisor;
		
		System.out.println(dividend + "/" + divisor + " = " + quotient);
		
		input.close();
	}

}
