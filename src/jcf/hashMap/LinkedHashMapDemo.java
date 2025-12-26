package jcf.hashMap;


import java.util.LinkedHashMap;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
		
		lm.put(111, "BTM");
		lm.put(112, "VIJAY");
		lm.put(113, "BTM 2nd Stage");

		System.out.println(lm);
	}

}
