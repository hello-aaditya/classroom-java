package oops.polymorphism.compileTime;



public class Calculator {
	
	// Method-1: add two integers
	int add(int number1, int number2) {
		return number1+number2;
	}
	
	// Method-2: add three integers
	int add(int number1, int number2, int number3) {
		return number1+number2+number3;
	}
	
	// Method-3: add two double values
	double add(double number1, double number2) {
		return number1+number2;
	}
}
