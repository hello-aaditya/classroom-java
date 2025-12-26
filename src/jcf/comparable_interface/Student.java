package jcf.comparable_interface;

public class Student implements Comparable<Student>{
	int roll;
	String name;
	double marks;
	
	Student(int roll, String name, double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return  roll + " " + name + " " + marks;
	}
	
	
	@Override
	public int compareTo(Student obj) {
		return this.name.compareTo(obj.name);
	}
}