package oops.polymorphism.runTime;



public class Child2 extends Parent1{
	
	@Override
	void display2() {
		System.out.println("Inside the Child2-display2 Overridden Method");
	}
	
	// Specialized Method
		void display3() {
			System.out.println("Inside the Child2-display3 Specialized Method");
		}
	
}
