package jcf.set.treeSet;



import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet();
		
		ts.add(100);
		ts.add(25);
		ts.add(75);
		ts.add(50);
		ts.add(150);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		
		System.out.println(ts.headSet(75)); // exclusion of 75
		
		System.out.println(ts.headSet(75, true)); // if want to include 75
		System.out.println(ts.headSet(75, false));  // exclusion of 75
		
		System.out.println(ts.tailSet(100)); // inclusion of 100
		System.out.println(ts.tailSet(100, false)); // if want to exclude 100
		
		System.out.println(ts.higher(100)); // next higher
		System.out.println(ts.higher(80)); // 80 is not in the ts and it gives next higher element
		
		System.out.println(ts.ceiling(80)); // ceil/above value of 80
		System.out.println(ts.ceiling(100)); // ceil/above value of 80
		/* difference between ceiling and higher
		 * ceiling gives the same or higher value
		 * higher always gives next higher value, it does not include the given value
		 */
		
		System.out.println(ts.lower(100));// previous lower
		System.out.println(ts.lower(80));
		
		System.out.println(ts.floor(100));
	}

}
