package jcf.hashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class MyStudentClassMain {

	public static void main(String[] args) {
		
		
		List<MyStudent> classA = new ArrayList<>();
		List<MyStudent> classB = new ArrayList<>();
		List<MyStudent> classC = new ArrayList<>();
		
		MyStudent s1 = new MyStudent(1, "Raghav");
		MyStudent s2 = new MyStudent(2, "Mohan");
		MyStudent s3 = new MyStudent(3, "Manohar");
		
		classA.add(s1);
		classA.add(s2);
		classA.add(s3);
		
		MyStudent s4 = new MyStudent(1, "Alice");
		MyStudent s5 = new MyStudent(2, "Bob");
		MyStudent s6 = new MyStudent(3, "Charlie");
		
		classB.add(s4);
		classB.add(s5);
		classB.add(s6);
		
		MyStudent s7 = new MyStudent(1, "David");
		MyStudent s8 = new MyStudent(2, "Eve");
		MyStudent s9 = new MyStudent(3, "Franklin");
		
		classC.add(s7);
		classC.add(s8);
		classC.add(s9);
		
		HashMap<String, List<MyStudent>> map = new HashMap<>();
		
		
		map.put("Class A", classA);
		map.put("Class B", classB);
		map.put("Class C", classC);
		
		
		// Fetch Student Details of class B
		List<MyStudent> classStudentDetails = map.get("Class B");
		
		for(MyStudent st : classStudentDetails) {
			System.out.println(st);
		}
		
		System.out.println("______________________________________\n");

		// Print all classes and their student details
		System.out.println("ACCESSING STUDENT DETAILS OF ALL THE CLASSES: ");
		for(String key : map.keySet()) {
			for(MyStudent student : map.get(key)) {
				System.out.println(student);
			}
		}
		
		
	}
}
