package jcf.list.arrayList;

import java.util.ArrayList;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.add("JAVA");
		al.add("SQL");
		al.add(100.56);
		al.add(true);
		al.add('k');
		
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		// using enhanced for loop
		for(Object x: al ) {
			System.out.print(x + " ");
		}

	}

}
