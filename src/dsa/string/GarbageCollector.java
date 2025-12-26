package dsa.string;

public class GarbageCollector {

	public static void main(String[] args) {
		String str = "Hello World!";
		System.out.println(str);
		
		str = null;
		
		System.out.println(str);
		
		// Call Garbage Collector to deallocate Object for "Hello World!"
		System.gc();
		System.out.println(str);
	}

}
