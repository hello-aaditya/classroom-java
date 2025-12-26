package jcf.hashMap;


import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		
		tm.put(01, "Ajay");
		tm.put(02, "Rani");
		
		// try to insert duplicate key value then "Vijay" will take place of "Ajay"
		tm.put(01,  "Vijay");
		
		System.out.println(tm);

	}

}
