package jcf.hashCode_and_equals;


import java.util.HashSet;

public class StudentInfoMain {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(11, "Ajay");
		StudentInfo s2 = new StudentInfo(12, "Raju");
		StudentInfo s3 = new StudentInfo(11, "Ajay");

		HashSet set = new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		
		System.out.println(set);
		
	}

}
