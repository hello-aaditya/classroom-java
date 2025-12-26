package dsa.string;


public class EqualsIgnoreCase {

	public static void main(String[] args) {
		String str1 = "Raja Ram Mohan Roy";
		String str2 = "raja ram mohan roy";
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Values are equals");
		} else {
			System.out.println("Values are not equals");
		}

	}

}