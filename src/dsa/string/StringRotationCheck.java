package dsa.string;



public class StringRotationCheck {

	public static void main(String[] args) {

		String str = "abcde";
		
		String rotatedStr = "cdeab";
		
		System.out.println( (isRotated(str, rotatedStr) == true) ?   
				"The string '" + rotatedStr + "' is a rotation of '" + str + "'." : "The string '" + rotatedStr + "' is not a rotation of '" + str + "'.");

	}
	public static boolean isRotated(String str, String rotatedStr) {
		int size1 = str.length();
		int size2 = rotatedStr.length();
		
		if(size1 != size2) {
			return false;
		}
		
		String doubleStr = str + str;
		return doubleStr.contains(rotatedStr);
	}

}
