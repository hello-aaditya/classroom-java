package jcf.arrayDeque;


import java.util.Collections;
import java.util.TreeSet;
import java.util.ArrayDeque;

public class ArrayDequeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(20);
		ad.add(10);
		ad.add(40);
		ad.add(30);
		ad.add(50);
		
		System.out.println(ad);

		// Collections.sort(ad); // Error
		
		TreeSet ts = new TreeSet(ad);
		System.out.println(ts);
	}

}
