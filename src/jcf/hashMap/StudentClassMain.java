package jcf.hashMap;



import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class StudentClassMain {

	public static void main(String[] args) {
		Student s1 = new Student(11, "Amith", 88.5);
		Student s2 = new Student(12, "Viajy", 87.1);
		Student s3 = new Student(13, "Akash", 83.2);
		
		HashMap<Integer, Student> hm = new HashMap<>();
		
		hm.put(1,  s1);
		hm.put(2,  s2);
		hm.put(3,  s3);
		
		System.out.println(hm);
		
		
		System.out.println("Key and Values: ");
		Set res3 = hm.entrySet();
		Iterator itr1 = res3.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
//		TreeMap<Integer, Student> tm = new TreeMap<>();
//		tm.put(1, s1);
//		tm.put(2,  s2);
//		tm.put(3,  s3);
//		
//		System.out.println(tm);
	}

}
