package jcf.queue.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(100);
		pq.add(111);
		pq.add(25);
		pq.add(75);
		pq.add(50);
		pq.add(150);
		pq.add(125);
		pq.add(175);
		pq.add(111);
		
		System.out.println(pq);

	}

}
