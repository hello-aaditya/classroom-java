package oops.different_types_of_classes.localClass;


public class Program1 {
	int a = 10;
	
	void myMethod() {
		class Program2 {
			int b = 20;
			
			void displayProgram2() {
				System.out.println("Inside Program1 -> Inside myMethod -> inside Program2 -> inside myMethod: ");
				System.out.println("The value of 'b': " + b);
				System.out.println("The value of 'a': " + a);
			}
		}
		Program2 p2 = new Program2();
		p2.displayProgram2();
	}
	
	void displayProgram1() {
		System.out.println("The value of 'a': " + a);
	}
}
