package jcf.comparator_interface;


import java.util.Comparator;

public class Helper implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj2.roll - obj1.roll;
	}
	
}
