package advanced_java.exceptionHandling;



import java.util.Scanner;
public class DivisionAndArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("CONNECTION ESTABLISHED ...");
		
		try {
			// Division
			
			System.out.print("ENTER DIVIDEND: ");
			int dividend = input.nextInt();
			
			System.out.print("ENTER DIVISOR: ");
			int divisor = input.nextInt();
			
			int quotient = dividend / divisor;
			
			System.out.println(dividend + "/" + divisor + " = " + quotient);
			
			// Array
			System.out.print("ENTER ARRAY LENGTH: ");
			int size = input.nextInt();
			int[] arr = new int[size];
			
			System.out.print("ENTER INDEX NO. TO STORE A VALUE: ");
			int index = input.nextInt();
			
			System.out.print("INSERT VALUE THAT YOU WANT TO WRITE ON INDEX " + index + ": ");
			int value = input.nextInt();
			
			arr[index] = value;
			
			System.out.println("arr[" + index + "] = " + value);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("... CONNECTION TERMINATED");
		
		input.close();
	}

}
