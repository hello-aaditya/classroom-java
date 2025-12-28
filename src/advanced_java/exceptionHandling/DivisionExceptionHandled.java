package advanced_java.exceptionHandling;

import java.util.Scanner;
public class DivisionExceptionHandled {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		try {
			System.out.print("ENTER DIVIDEND: ");
			int dividend = input.nextInt();
			
			System.out.print("ENTER DIVISOR: ");
			int divisor = input.nextInt();
			
			int quotient = dividend / divisor;
			System.out.println(dividend + "/" + divisor + " = " + quotient);
		}
		catch(Exception e) {
			System.out.println("EXCEPTION HANDLED");
		}

		input.close();
	}

}
