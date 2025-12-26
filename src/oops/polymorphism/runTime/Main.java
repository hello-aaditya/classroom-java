package oops.polymorphism.runTime;

public class Main {

	public static void main(String[] args) {
		// creating child object and give it to child type reference
		Child c1 = new Child();
		c1.display1();
		c1.display2();
				
		System.out.println("---------------------------------------");
				
		// creating child object and give it to parent type reference
		Parent p = new Child();
		p.display1();
		p.display2();
	}

}
