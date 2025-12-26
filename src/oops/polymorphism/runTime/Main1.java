package oops.polymorphism.runTime;


public class Main1 {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		accessMethod(c1);
		
		Child2 c2 = new Child2();
		accessMethod(c2);
	}
	
	public static void accessMethod(Parent1 ref) {
		ref.display1();
		ref.display2();
		
		if(ref instanceof Child1) {
			((Child1)(ref)).display3();
		} else {
			((Child2)(ref)).display3();
		}
		System.out.println("_______________________");
	}
}
