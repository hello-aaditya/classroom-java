package dsa.string;



public class LearnString {

	public static void main(String[] args) {
		String str = "Kumar Technologies";
		
		System.out.println(str); // Kumar Technologies
		
		System.out.println(str.toUpperCase()); // KUMAR TECHNOLOGIES
		System.out.println(str.toLowerCase()); // kumar technologies

		
		System.out.println(str.charAt(0)); // K
		// System.out.println(str.charAt(-1)); // StringIndexOutOfBoundsException
		// System.out.println(str.charAt(88)); // StringIndexOutOfBoundsException
		System.out.println(str.charAt(-3+5)); // m
		
		
		System.out.println(str.indexOf("s")); // 17
		System.out.println(str.indexOf('K')); // 0
		
		System.out.println(str.lastIndexOf("s")); // 17
		System.out.println(str.lastIndexOf("e")); // 16
		
		System.out.println(str.contains("e")); // true
//		System.out.println(str.contains('e')); // error
		
		
		System.out.println(str.startsWith("K")); // true
		System.out.println(str.startsWith("Kum")); // true
		System.out.println(str.startsWith("m")); // false
		
		
		System.out.println(str.endsWith("s")); // true
		System.out.println(str.endsWith("K")); // false
		
		String strrr = "";
		String strr1 = "    ";
		System.out.println(strrr.isEmpty()); // true
		System.out.println(strrr.isBlank()); // true
		
		System.out.println(strr1.isEmpty()); // false
		System.out.println(strr1.isBlank()); // true
		
		
		System.out.println(str.length()); // 16
		
		System.out.println(str.replace("e", "z")); // Kumar Tzchnologizs

		
		
		String strr = "Kumar Technologies";
		
		char ch[] = strr.toCharArray();
		for(char c : ch) {
			System.out.print(c + "  ");
		}
		System.out.println();
		
		
		System.out.println(str.substring(0)); // Kumar Technologies
		System.out.println(str.substring(0, 4)); // Kuma
		System.out.println(str.substring(str.length()-3, str.length()-1)); // ie
		
		
		String stry = "       Kumar Tech.    ";
		
		System.out.println(stry); //        Kumar Tech.    
		System.out.println(stry.trim()); // Kumar Tech.
	}

}
