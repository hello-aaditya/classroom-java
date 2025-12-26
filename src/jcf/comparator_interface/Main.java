package jcf.comparator_interface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(11, "Amith", 80.5);
		Student s2 = new Student(13, "Rohit", 60.5);
		Student s3 = new Student(12, "Mohit", 70.5);
		
		ArrayList list = new ArrayList();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);

		System.out.println("Before Sort: " + list);
		
		
		Collections.sort(list, new Comparator<Student>(){
			@Override
			public int compare(Student obj1, Student obj2) {
				return obj1.roll - obj2.roll;
			}
		});
		System.out.println("After Sort: " + list);
		
	}

}
