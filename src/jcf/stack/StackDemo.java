package jcf.stack;

import java.util.ArrayDeque;

public class StackDemo {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		
		ad.push(10);
		ad.push(20);
		ad.push(30);
		ad.push(40);
		ad.push(50);
		ad.push(60);
		
		System.out.println(ad);
		
		System.out.println(ad.pop());
		System.out.println(ad);
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad);

	}

}
