package jcf.comparator_interface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop lap1 = new Laptop(2, "i5", 85000.0);
		Laptop lap2 = new Laptop(1, "AMD", 75000.0);
		Laptop lap3 = new Laptop(3, "i7", 65000.0);
		
		ArrayList<Laptop> list = new ArrayList<>();
		
		list.add(lap1);
		list.add(lap2);
		list.add(lap3);

		System.out.println("Before Sorting: ");
		for(Laptop lap : list) {
			System.out.println(lap);
		}
		
		System.out.println("*******************");
		
		Collections.sort(list, new Comparator<Laptop>() {
			@Override
			public int compare(Laptop lap1, Laptop lap2) {
				return Double.compare(lap2.price, lap1.price);
			}
		});
		
		System.out.println("After Sorting: ");
		System.out.println("Sorting (Descending) based on Price: ");
		for(Laptop lap : list) {
			System.out.println(lap);
		}
	}

}
