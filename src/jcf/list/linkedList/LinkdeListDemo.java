package jcf.list.linkedList;

import java.util.LinkedList;

public class LinkdeListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Raja");
		ll.add("Rani");
		ll.add("Mantri");
		ll.add("Chor");
		ll.add("Sipahi");
		
		for(String str : ll) {
			System.out.print(str + " ");
		}
		

	}

}
