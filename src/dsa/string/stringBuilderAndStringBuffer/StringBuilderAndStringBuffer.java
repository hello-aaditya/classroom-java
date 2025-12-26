package dsa.string.stringBuilderAndStringBuffer;


public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println("StringBuilder: ");
		System.out.println(sb.capacity()); // 16
		System.out.println(sb.length()); // 0

		sb.append("Java");
		System.out.println(sb.capacity()); // 16
		System.out.println(sb.length()); // 4

		sb.append(" is a programming language");
		System.out.println(sb.capacity()); // 34
		System.out.println(sb.length()); // 30

		sb.append(" and it is also a object oriented");
		System.out.println(sb.capacity()); // 70
		System.out.println(sb.length()); // 63
		
		
		System.out.println("StringBuffer: ");
		
		StringBuffer sbf = new StringBuffer();
		System.out.println(sbf.capacity()); // 16
		System.out.println(sbf.length()); // 0

		sbf.append("Java");
		System.out.println(sbf.capacity()); // 16
		System.out.println(sbf.length()); // 4

		sbf.append(" is a programming language");
		System.out.println(sbf.capacity()); // 34
		System.out.println(sbf.length()); // 30

		sbf.append(" and it is also a object oriented");
		System.out.println(sbf.capacity()); // 70
		System.out.println(sbf.length()); // 63
		
		StringBuilder sbl = new StringBuilder();
		sbl.ensureCapacity(100);
		System.out.println(sbl.capacity());
	}

}
