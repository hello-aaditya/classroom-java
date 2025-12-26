package jcf.comparable_interface;


import java.util.ArrayList;
import java.util.Collections;

public class LaptopMain {

	public static void main(String[] args) {
		// 3 objects creation
		Laptop lap1 = new Laptop(2, "i5", 85000.0);
		Laptop lap2 = new Laptop(1, "AMD", 75000.0);
		Laptop lap3 = new Laptop(3, "i7", 65000.0);
		
		// ArrayList to store all the objects
		ArrayList<Laptop> list = new ArrayList<>();
		
		list.add(lap1);
		list.add(lap3);
		list.add(lap2);
		
		// list before sorting
		System.out.println("Before sorting: ");
		for(Laptop l : list) {
			System.out.println(l);
		}
		
		// sorting
		Collections.sort(list);
		
		System.out.println("*****************************");

		// list after sorting		
		System.out.println("Sorting based on id: ");
		System.out.println("After sorting: ");
		for(Laptop l : list) {
			System.out.println(l);
		}
	}

}
