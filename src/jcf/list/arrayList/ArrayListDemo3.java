package jcf.list.arrayList;



import java.util.*;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(125);
		al.add(75);
		al.add(175);
		al.add(150);
		
		// iterating through loop
		
		// normal for-loop
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		// enhanced for-loop
		
		System.out.print("Print using enhanced for-loop: ");
		for(Object x : al ) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// Iterate through Iterator
		System.out.print("[");
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
			if(itr.hasNext()) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

}
