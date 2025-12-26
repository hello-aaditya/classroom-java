package oops.abstraction;

public class Main {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		accessMethod(c1);
		accessMethod(c2);
	}
	
	public static void accessMethod(Parent ref) {
		ref.display1();
		ref.display2();
		ref.display3();
		// we have to perform downcasting here and use instanceof
		
//		if(ref instanceof Child1) {
//			((Child1)(ref)).display1();
//			((Child1)(ref)).display2();
//		}
//				
//		if(ref instanceof Child2) {
//			((Child2) (ref)).display1();
//			((Child2) (ref)).display2();
//		}
	}

}
