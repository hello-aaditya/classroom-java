package jcf.list.arrayList;



import java.util.ArrayList;
public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		System.out.println("Size: " + al.size());
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		al.add("JAVA");
		al.add("SQL");
		al.add(100.56);
		al.add(true);
		al.add('k');
		
		System.out.println(al);
		System.out.println("Size: " + al.size());
		
		System.out.println(al.contains(100.56));
		System.out.println("Is the word 'JAVA' present: " + al.contains("JAVA"));
		System.out.println("Is the word 'Java' present: " + al.contains("Java"));
		
		System.out.println("At position 0:" + al.get(0));
		System.out.println("At position 6:" + al.get(6));
//		System.out.println("At position 15:" + al.get(15)); // error
		
		System.out.println("In the first place: " + al.getFirst()); // 10
		System.out.println("In the last place: " + al.getLast()); // k
		
		System.out.println("The element '20' is present at index: " + al.indexOf(20));
		
		al.add(20);
		System.out.println("The element '20' is present at index (from the last): " + al.lastIndexOf(20));
		
		System.out.println("Is Array List empty: " + al.isEmpty()); // false
		
		System.out.println("Array List: " + al);
		
		al.remove(0); // removes the element in 0th position
		System.out.println("After removing the content inside 0th position, the ArrayList is: " + al);
		
		al.add(0, 10);
		System.out.println("At first pos, i have added 10. now the Array List is: " + al);
		
		al.removeFirst();
		System.out.println("After removing first element from the ArrayList" + al);
		
		al.removeLast();
		System.out.println("After removing last element from the ArrayList" + al);
		
		al.set(8, 'Z');
		System.out.println("Replace the value at '8th' index ('k' -> 'Z'): " + al);
		
		ArrayList al2 = new ArrayList();
        al2.add(100);
        al2.add(300);
        al2.add(200);
        System.out.println("The new Array List is: " + al2);
        
        // copy the content of al2 inside al 
        al.addAll(al2);
        System.out.println("After adding all the elemnt from al2 to al" + al);

	}

}
