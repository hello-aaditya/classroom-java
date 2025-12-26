package jcf.concurrent_Collection;


import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			list.add(99);
		}

	}

}