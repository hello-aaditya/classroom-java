package jcf.comparable_interface;

public class Student1 implements Comparable<Student1>{

	int roll;
	String name;
	double marks;
	
	Student1(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return roll + " " + name + " " + marks;
	}
	
	@Override
	public int compareTo(Student1 obj) {
		return this.roll - obj.roll;
	}
}

