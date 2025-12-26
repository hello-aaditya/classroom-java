package oops.method_hiding;



public class Main {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.display1();
		p.display2();
		
		System.out.println("__________________________________");
		
		Child c = new Child();
		c.display1();
		c.display2();
		
		System.out.println("__________________________________");
		
		Parent pr = new Child();
		pr.display1();
		pr.display2();

	}

}
