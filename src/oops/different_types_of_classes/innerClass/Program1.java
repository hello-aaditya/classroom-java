package oops.different_types_of_classes.innerClass;

public class Program1 {
	static int a = 10;
	
	static class Program2 {
		static int b = 20;
		
		static void displayProgram2() {
			System.out.println("The value of 'a': " + a);
			System.out.println("The value of 'b': " + b);
		}
	}
	
	void displayProgram1() {
		System.out.println("The value of 'a': " + a);
		Program2.displayProgram2();
	}
}