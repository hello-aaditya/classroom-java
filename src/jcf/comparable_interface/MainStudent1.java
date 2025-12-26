package jcf.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudent1 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(11, "Amith", 80.5);
		Student1 s2 = new Student1(13, "Rohit", 60.5);
		Student1 s3 = new Student1(12, "Mohit", 70.5);
		
		ArrayList al = new ArrayList();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
	}

}
