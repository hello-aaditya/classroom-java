package jcf.hashMap;


import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		hm.put(11,  2000);
		hm.put(12,  3000);
		
		hm.put(13, "Raja");
		hm.put(14, "Ajay");

		System.out.println(hm);
	}

}
