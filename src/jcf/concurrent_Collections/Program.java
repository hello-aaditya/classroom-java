package jcf.concurrent_Collections;



import java.util.concurrent.CopyOnWriteArrayList;

public class Program {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
	}

}
