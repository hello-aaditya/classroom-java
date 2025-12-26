package oops.interfaceCode;


public class Square implements Shape {
	
	@Override
	public void calArea(int side) {
		System.out.println(side * side);
	}
	
	@Override
	public void calArea(double radius) {
		System.out.println(Math.PI*radius*radius);
	}
}
