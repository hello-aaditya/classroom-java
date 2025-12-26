package jcf.hashCode_and_equals;


import java.util.Objects;

public class StudentInfo {
	
	int roll;
	String name;
	StudentInfo(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	void display() {
		System.out.println("Roll: " + roll);
		System.out.println("Name: " + name);
	}
	
	@Override
	public boolean equals(Object obj) {
		StudentInfo s = (StudentInfo)obj;
		if(this.roll == s.roll && this.name.equals(s.name)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(roll, name);
	}
	
	@Override
	public String toString() {
		return roll + " " + name;
	}
	
}
