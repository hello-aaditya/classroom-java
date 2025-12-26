package oops.polymorphism.runTime;


public class Child1 extends Parent1{
	
	@Override
	void display2() {
		System.out.println("Inside the Child1-display2 Overridden Method");
	}
	
	// Specialized Method
	void display3() {
		System.out.println("Inside the Child1-display3 Specialized Method");
	}
}
