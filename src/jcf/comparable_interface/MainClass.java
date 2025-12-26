package jcf.comparable_interface;


import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student(11, "Amith", 88.9);
		Student s2 = new Student(13, "Rohit", 75.4);
		Student s3 = new Student(12, "Mohit", 78.9);
		
		ArrayList al = new ArrayList();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}
