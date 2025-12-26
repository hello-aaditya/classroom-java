package jcf.list.arrayList;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add(20);
		list.add(45);
		list.add(99);
		list.add(10);
		list.add(12);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}