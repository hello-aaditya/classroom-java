package jcf.arrayDeque;


import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		
		// add data
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(60);
		ad.add(70);
		
		
		System.out.println("ArrayDeque Elements: " + ad);
		
		// add elements to first place
		ad.addFirst(99);
		System.out.println("\nUpdated ArrayDeque: " + ad);
		
		ad.addFirst(88);
		System.out.println("\nUpdated ArrayDeque: " + ad);
		
		// add elements to last place		
		ad.addLast(77);
		System.out.println("\nUpdated ArrayDeque: " + ad);
		ad.addLast(88);
		System.out.println("\nUpdated ArrayDeque: " + ad);
		
		// .remove(),  .removeFirst(), .pollFirst() is similar
		System.out.println(ad.remove() + " is removed using .remove()"); 
		System.out.println(ad.removeFirst()  + " is removed using .removeFirst()");
		System.out.println(ad.poll() + " is removed using .poll()");
		System.out.println(ad.pollFirst()  + " is removed using .pollFirst()");
		System.out.println("\nUpdated ArrayDeque: " + ad + "\n");
		
		
		System.out.println(ad.removeLast()  + " is removed using .removeLast()");
		System.out.println(ad.pollLast()   + " is removed using .pollLast()");
		System.out.println("Updated ArrayDeque: " + ad + "\n");
		
		System.out.println("Return the first element using .peek(): " + ad.peek());
		System.out.println("Return the first element using .peekFirst(): " + ad.peekFirst());
		System.out.println("Return the last element using .peekLast(): " + ad.peekLast());
		System.out.println("Updated ArrayDeque: " + ad + "\n");
	}

}
