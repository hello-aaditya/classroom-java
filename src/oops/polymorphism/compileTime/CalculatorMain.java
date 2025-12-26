package oops.polymorphism.compileTime;


public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("Two integer values addition: " + calc.add(10, 20));
		System.out.println("Three integer values addition: " + calc.add(10, 15, 25));
		System.out.println("Two double values addition: " + calc.add(40.0, 60.0));
	}

}
