package jcf.queue.priorityQueue;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int size = input.nextInt();
		
		PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
		
		for(int i=0; i<size; i++) {
			System.out.print("Enter element: ");
			pq.add(input.nextInt());
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.poll() + " ");
		}
		

	}

}
