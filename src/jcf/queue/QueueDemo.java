package jcf.queue;


import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println("Queue Elements: " + q); // [10, 20, 30, 40, 50]

		
		System.out.println("Remove Element using .remove(): " + q.remove());
		System.out.println("Updated Queue: " + q);
		
		
		System.out.println("\nRemove Element using .remove(): " + q.remove());
		System.out.println("Updated Queue: " + q);
		
		
		// .poll() is equivalence to .remove()
		System.out.println("\nRemove Element using .poll(): " + q.poll());
		System.out.println("Updated Queue: " + q);
		
		
		// .peek() is just return the first element. not delete it.
		System.out.println("\n.peek() returns the first element of the queue: " + q.peek());
		System.out.println("Updated Queue: " + q);
	}

}
